package fr.baldir.meta.annotations.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks an instance as following the decorator pattern:
 * "allows behaviour to be added to an existing object dynamically"
 *
 * @see <a href="http://en.wikipedia.org/wiki/Decorator_pattern">Decorator Pattern (Wikipedia)</a>
 * @see <a href="https://refactoring.guru/fr/design-patterns/decorator">Décorateur - Refactoring Guru</a>
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Decorator {

}