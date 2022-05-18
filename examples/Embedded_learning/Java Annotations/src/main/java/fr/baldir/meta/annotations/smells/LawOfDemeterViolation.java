package fr.baldir.meta.annotations.smells;

import fr.baldir.meta.annotations.antipatterns.LeakingAbstraction;
import fr.baldir.meta.annotations.best.practices.TellDontAsk;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks this code as NOT following the The Law of Demeter (LoD) or Principle of
 * Least Knowledge, aka "Don't talk to strangers".
 *
 * @see LeakingAbstraction
 * @see <a href="https://en.wikipedia.org/wiki/Law_of_Demeter">Law of Demeter</a>
 * @see TellDontAsk
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface LawOfDemeterViolation {
    String value() default "";
}
