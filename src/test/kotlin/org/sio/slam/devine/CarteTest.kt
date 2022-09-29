package org.sio.slam.devine



import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.fail
import org.sio.slam.devine.core.Carte
import org.sio.slam.devine.enum.CouleurCarte
import org.sio.slam.devine.enum.NomCarte

class CarteTest {

    /**
     * Déclaration et définition d'un objet à tester, accessible par toutes les méthodes de test de cette classe
     * On nomme cet objet OUT (Object Under Test)
     * Les méthodes peuvent également créer localement d'autres objets à tester.
     */
    private var valetDeCoeur : Carte = Carte(NomCarte.VALET, CouleurCarte.COEUR)

    @Test
    fun getNom() {
        assertEquals("VALET", this.valetDeCoeur.nom.name)
        assertNotEquals("Valet", this.valetDeCoeur.nom.name)
    }

    @Test
    fun getCouleur() {
        // test sur le nom (String)
        assertEquals("COEUR", this.valetDeCoeur.couleur.name)

        // test sur la valeur énumérée
        assertEquals(CouleurCarte.COEUR, this.valetDeCoeur.couleur)

        // test sur mauvaise valeur énumérée
        assertNotEquals(CouleurCarte.PIQUE, this.valetDeCoeur.couleur)
    }

     @Test
     fun valeurCartes() {
         assertEquals(11, this.valetDeCoeur.valeur)

         val asDeCoeur : Carte = Carte(NomCarte.AS, CouleurCarte.COEUR)
         val roiDeCoeur : Carte = Carte(NomCarte.ROI, CouleurCarte.COEUR)
         val troisDePique : Carte = Carte(NomCarte.TROIS, CouleurCarte.PIQUE)

         assertEquals(14, asDeCoeur.valeur)
         assertEquals(13, roiDeCoeur.valeur)
         assertEquals(3, troisDePique.valeur)

         assertNotEquals(asDeCoeur.valeur,roiDeCoeur.valeur)
     }

     @Test
     fun compareCartesDeMemeCouleurMaisDeValeurDifferente()  {
         val asDeCoeur : Carte = Carte(NomCarte.AS, CouleurCarte.COEUR)
         val roiDeCoeur : Carte = Carte(NomCarte.ROI, CouleurCarte.COEUR)

         // test avec compareTo
         assertTrue(asDeCoeur.compareTo(roiDeCoeur) > 0 )

         // Finalement, si les objets sont *comparables*
         // alors les opérateurs binaires de comparaisons sont applicables
         // L'opérateur '>' appellera automatiquement la méthode compareTo (comme ci-dessus)
         // voir https://kotlinlang.org/docs/collection-ordering.html" - ordre naturel
         assertTrue(asDeCoeur > roiDeCoeur)
     }

    @Test
    fun compareCartesDeCouleurDifferenteMaisDeMemeValeur()  {
        // TODO test à implémenter : Attention dépend de la hiérarchie des couleurs retenue
        //   prévoir plusieurs méthodes (plusieurs cas)
        fail("Relation d'ordre total à tester ici Vous devrez mettre au point la méthode compareTo !")
    }

    // autres cas de test

 }
