import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.SimpleElementVisitor8;
import javax.lang.model.util.SimpleElementVisitor9;
import javax.tools.Diagnostic;
import java.util.Set;
import java.util.stream.Collectors;

@SupportedAnnotationTypes("java.lang.Deprecated")
@SupportedSourceVersion(SourceVersion.RELEASE_9)
public class DeprecatedProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
    annotations.forEach(type->type.accept(DEPRECATED_VISITOR,env));
    return true;
    }

    private final ElementVisitor<TypeElement,RoundEnvironment> DEPRECATED_VISITOR =
            new SimpleElementVisitor8<>(){
                public TypeElement visitType(TypeElement type,RoundEnvironment env){
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING,
                            env.getElementsAnnotatedWith(type).stream()
                    .map(Element::toString)
                    .collect(Collectors.joining(",", type + " (",")")));
                    return super.visitType(type,env);
                }
            };

}
