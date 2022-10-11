package org.sio.slam.devine.core

import kotlin.math.log2

class Jeu(val avecAide: Boolean, val paquet: Paquet, paramCarteADeviner: Carte? = null) {
    val carteADeviner: Carte
        // le getter par défaut, inutile de le redéclarer (juste pour la démonstration)
        // field est ici synonyme de carteADeviner (implicite backing memory de la propriété)
        // REM : faire référence à carteADeviner au lieu de field entrainerait une récursion incontrôlée
        get() = field
        // set(value) { field = value } <== impossible car la propriété est en lecture seule (val)

    init {
        // si le paramètre paramCarteADeviner du constructeur a comme valeur null
        // alors on demande au paquet de nous fournir une carte à deviner
        // sinon on retient la valeur de carte transmise
        this.carteADeviner = paramCarteADeviner ?: this.paquet.getCarteADeviner()
    }

    /**
     * Permettre de savoir si la proposition de carte EST bien la carte à deviner, ou non
     */
    fun isMatch(carteProposee: Carte): Boolean {
        return this.carteADeviner == carteProposee
    }

    /**
     * Analyse la partie du joueur, a-t-il abandonné la partie,
     *  a-t-il trouvé la carte en un nombre de fois "convenable" ou "inconvenable",
     *  a-t-il eu de la chance ?
     */
    fun strategiePartie(nbEssais : Int , abandonner: Boolean): String {
        if(!abandonner){
            if(avecAide){
                val iaTry : Double = log2(paquet.cartes.size.toDouble())
                if(nbEssais.toDouble() >= iaTry*1.80){
                    return "Stratégie dichotomique peu précise, vous avez fais $nbEssais essais"
                }
                else if (nbEssais.toDouble() >= iaTry +1 && nbEssais.toDouble() < iaTry * 1.80){
                    return "Stratégie dichotomique assez précise, vous avez fais $nbEssais essais"
                }
                else if (nbEssais == iaTry.toInt()) {
                    return "Stratégie dichotomique très précise, vous avez fais $nbEssais essais"
                }
                else{
                    return "Peu de stratégie sûrement de la chance, vous avez fais $nbEssais essais"
                }
            }
            else{
                val pourcentChance : Double = (nbEssais.toDouble() / paquet.cartes.size.toDouble())*100.0
                return if (nbEssais / paquet.cartes.size <= 0.25){
                    "Stratégie linéaire, vous aviez ${pourcentChance.toInt()}% de chance de trouver, vous avez $nbEssais essais"
                }
                else{
                    "Stratégie linéaire, vous aviez ${pourcentChance.toInt()}% de chance de trouver, vous avez $nbEssais essais"
                }
            }
            return "Erreur"
        }
        else{
            return "Pas de stratégie"
        }
    }

    fun help (carteDuJoueur : Carte): Unit{
        if(carteDuJoueur.valeur < carteADeviner.valeur)
            println("Votre carte est plus petite que la carte à deviner !")
        else if(carteDuJoueur.valeur > carteADeviner.valeur)
            println("Votre carte est plus grande que la carte à deviner")
        else
            println("Votre carte est de la bonne valeur")

        if (carteDuJoueur.couleur != carteADeviner.couleur)
            println("Votre carte n'est pas de la bonne couleur")
        else
            println("Votre carte est de la bonne couleur")
    }

}
