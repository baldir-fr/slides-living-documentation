# Living Glossary in Java

An example of how could be generated a living diagram against a Java codebase.

## Inputs

Java files with marker annotations (ex. `@AggregateRoot`, `@Entity`). Such annotations are shown in [Patternity](https://github.com/cyriux/Patternity/tree/master/patternity-annotations/src/main/java/com/patternity/annotation/ddd/stereotype) by [Cyrille Martraire](https://twitter.com/cyriux).

`ShoppingCart.java`

```java
package com.organisation.domain.order;
/**
 * A shopping cart blah blah blah.
 */
@Aggregate
public class ShoppingCart{
    // ...
}
```

`ShoppingCartItem.java`

```java
package com.organisation.domain.order;
/**
 * An item that is hold the shopping cart to be ordered.
 */
@Entity
public class ShoppingCartItem{
    // ...
}
```

```markdown
# Order

[Link](/src/main/java/com/organisation/domain/order/)

## Shopping Cart

A shopping cart blah blah blah.

[Link](/src/main/java/com/organisation/domain/order/ShoppingCart.java)

### Shopping Cart Item

An item that is hold the shopping cart to be ordered.

[Link](/src/main/java/com/organisation/domain/order/ShoppingCartItem.java)
```