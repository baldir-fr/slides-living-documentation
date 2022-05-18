package fr.baldir.meta.annotations.testing;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks this zone of code as dedicated to Acceptance Tests.
 * <p>
 * Acceptance Tests are customer-facing tests that capture the domain logic the
 * system must perform and demonstrates that it performs them.
 * <p>
 * Acceptance Tests must be written using nothing but vocabulary from the domain
 * (e.g. trade, bank, order... in the case of finance), without talking about
 * any technical concern (DB, persistence, login, clicking a button...)
 *
 * @see <a href="http://www.natpryce.com/articles/000772.html">Acceptance Tests</a>
 */
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface AcceptanceTests {

    String description() default "";
}