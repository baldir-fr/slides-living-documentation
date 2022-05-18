package fr.baldir.meta.annotations.antipatterns;

import fr.baldir.meta.annotations.best.practices.DomainModel;

/**
 * An anemic domain model has not much behavior and is usually just a bag of data.
 * By having so little behavior, it generally implies that the behavior is duplicated around the various clients.
 * It also usually means that we cannot clearly see the use cases related to the domain object.
 * A sign that a domain model is anemic: it has getters and setters that have not meaningful business name.
 *
 * @see <a href="https://web.archive.org/web/20220314071528/https://www.martinfowler.com/bliki/AnemicDomainModel.html">Martin Fowler - AnemicDomainModel</a>
 * @see <a href="https://web.archive.org/web/20210225113750/https://www.oreilly.com/library/view/implementing-domain-driven-design/9780133039900/">
 * Vaughn Vernon - Implementing Domain-Driven Design</a> Chapter 1 : Getting Started with DDD - Look at What Anemia Does to Your Model
 * @see DomainModel
 */
public @interface AnemicDomainModel {

}
