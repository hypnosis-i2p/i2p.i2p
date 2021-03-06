package net.i2p.data

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * @author str4d
 */
class SigningPublicKeySpec extends FunSpec with ShouldMatchers {
    val signingPublicKey = new SigningPublicKey

    describe("A SigningPublicKey") {
        it("should be 128 bytes long") {
            signingPublicKey should have length (128)
        }
    }
}
