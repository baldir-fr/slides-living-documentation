package fr.baldir.meta.annotations.ddd.stereotypes;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents a value object (immutable and with no identity)
 * Objects that are equal due to the value of their properties are called value objects.
 *
 * @see <a href="https://martinfowler.com/bliki/ValueObject.html">ValueObject - MartinFowler</a>
 */
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface ValueObject {
}
