package fr.baldir.meta.annotations.smells;

/**
 * Signs and symptoms
 * <ul>
 *     <li>
 *       Use of primitives instead of small objects for simple tasks
 *       (such as currency, ranges, special strings for phone numbers, etc.)
 *     </li>
 *     <li>
 *       Use of constants for coding information
 *       (such as a constant USER_ADMIN_ROLE = 1 for referring to users with administrator rights.)
 *     </li>
 *     <li>
 *       Use of string constants as field names for use in data arrays.
 *     </li>
 * </ul>
 *
 * @see <a href="https://refactoring.guru/fr/smells/primitive-obsession">Primitive Obsession - Refactoring Guru</a>
 */
public @interface PrimitiveObsession {
}
