package org.sio.slam.devine.core

import org.sio.slam.devine.enum.CouleurCarte
import org.sio.slam.devine.enum.NomCarte

/**
 * Carte à jouer traditionnelle simplifiée. Sa valeur dépend de son nom qui détermine ses points.
 * une carte se compare à une aurtre par rapport à leur nom (ou valeur) ET leur couleur
 * Ainsi on considère qu'il existe une hiérarchie de valeurs entre les couleurs (à déterminer).
 * @see [org.sio.slam.devine.enum.NomCarte] Les noms de cartes sont associées à une valeur de points
 * @see [org.sio.slam.devine.enum.CouleurCarte] TODO définir ici la relation d'ordre entre les couleurs
 */
class Carte constructor(
    val nom: NomCarte,
    val couleur: CouleurCarte
) : Comparable<Carte> {

    /**
     * La valeur d'une carte est déterminée par son nombre de points (qui dépend des points associés
     * à son nom dans la déclaration du type énuméré NomCarte @see [org.sio.slam.enum.NomCarte])
     */
    val valeur: Int
        get() = this.nom.points  // DEUX => 2, TROIS => 3, ... , AS => 14

    /**
     * Les cartes se comparent en fonction de leur valeur et de leur couleur
     * Si this et other ont même valeur et même couleur, alors nous avons à faire à 2 mêmes cartes
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/compare-to.html">compareTo API</a>
     */
    override fun compareTo(other: Carte): Int {
        // TODO prendre aussi en compte la couleur
        // (en déterminant une hiérarchie entre couleurs)
        // par exemple un ROI de Coeur est-il plus grand ou plus petit qu'un ROI de Pique ?
        // vous expliquerez, dans le description KDoc de cette fonction, quelle logique vous avez retenue et pourquoi
        return this.valeur.compareTo(other.valeur)
    }

    override fun equals(other: Any?): Boolean {
        return other is Carte && this.nom === other.nom && this.couleur === other.couleur
    }

    override fun hashCode(): Int {
        var result = nom.hashCode()
        result = 31 * result + couleur.hashCode()
        return result
    }

    override fun toString(): String {
        return "Carte ${nom.name} de ${couleur.name} (valeur : ${valeur})"
    }
}
