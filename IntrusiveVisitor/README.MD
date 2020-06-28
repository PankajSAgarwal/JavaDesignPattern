# Visitor
When you want to augment the functionality of entire hierarchy of dependencies 
##Intrusive visitor
## Problems with intrusive visitor
If you have to add a new functionality that propopagates to hierarchy of inheritance , it is possible while adding the new concern to the base class we are braking SRP principle and open and closed principle.

## Reflective visitor

uses reflection

## Classic visitor or double dispatch visitor
Most widely used in real world

## Acyclic visitor