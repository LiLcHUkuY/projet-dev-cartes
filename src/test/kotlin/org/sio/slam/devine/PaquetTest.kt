package org.sio.slam.devine


import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.fail
import org.sio.slam.devine.core.Carte
import org.sio.slam.devine.core.Paquet
import org.sio.slam.devine.enum.CouleurCarte
import org.sio.slam.devine.enum.NomCarte

internal class PaquetTest {

    @Test
    fun cardinal2Cartes() {
        val paquet2Cartes = Paquet(listOf(
            Carte(NomCarte.VALET, CouleurCarte.COEUR),
            Carte(NomCarte.DIX, CouleurCarte.TREFLE),
        ))
        assertEquals(2, paquet2Cartes.cardinal())
    }

    @Test
    fun testToString2Cartes() {
        val paquet2Cartes = Paquet(listOf(
            Carte(NomCarte.VALET, CouleurCarte.COEUR),
            Carte(NomCarte.DIX, CouleurCarte.TREFLE),
        ))
        assertEquals("Paquet de 2 cartes", paquet2Cartes.toString() )
    }

    @Test
    fun testGetCartes() {
        fail("test accesseur get cartes à implémenter")
    }

    @Test
    fun fabriqueDe32Cartes() {
        // TODO test fabriqueDe32Cartes à implémenter :
        fail("fabriqueDe32Cartes à implémenter")
    }

    @Test
    fun fabriqueDe52Cartes() {
        // TODO test fabriqueDe52Cartes à implémenter :
        fail("fabriqueDe52Cartes à implémenter")
    }
}
