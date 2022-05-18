package fr.baldir.meta.annotations;

import fr.baldir.meta.annotations.smells.TechnicalDept;

/**
 * Cet élément de code n'est pas voué à rester tel quel dans le code.
 * Il peut être nécessaire d'introduire une abstraction temporaire pour découpler.
 * A supprimer dès que possible!
 *
 * @see TechnicalDept
 */
public @interface Temporary {
}
