package org.sio.slam.devine.fabrique

import org.sio.slam.devine.core.Carte
import org.sio.slam.devine.enum.CouleurCarte
import org.sio.slam.devine.enum.NomCarte

/*** Création d'un paquet de 32 cartes ***/
fun createJeu32Cartes() : List<Carte>
{
    var listeCartes: MutableList<Carte> = mutableListOf()
    for (couleur in CouleurCarte.values())
    {
        for (nom in NomCarte.values())
        {
            when (nom.toString()) {
                "DEUX", "TROIS", "QUATRE", "CINQ", "SIX" -> continue
                else -> listeCartes.add(Carte(nom, couleur))
            }
        }
    }
    return listeCartes
}

/*** Création d'un paquet de 52 cartes ***/
fun createJeu52Cartes() : List<Carte>
{
    var listeCartes: MutableList<Carte> = mutableListOf()
    for (couleur in CouleurCarte.values())
    {
        for (nom in NomCarte.values())
        {
            listeCartes.add(Carte(nom, couleur))
        }
    }
    return listeCartes
}