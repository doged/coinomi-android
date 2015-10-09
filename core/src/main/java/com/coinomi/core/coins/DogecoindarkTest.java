package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;
import com.coinomi.core.coins.families.PeerFamily;

import org.bitcoinj.core.Coin;

/**
 * @author John L. Jegutanis
 */
public class DogecoindarkTest extends CoinType {
    private DogecoindarkTest() {
        id = "dogecoindark.test";

        addressHeader = 115;
        p2shHeader = 198;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 240; // COINBASE_MATURITY_NEW
		dumpedPrivateKeyHeader = 243;
		
		family = PeerFamily.get();
        name = "Dogecoindark Test";
        symbol = "DOGEDt";
        uriScheme = "dogecoindark";
        bip44Index = 2;
        unitExponent = 8;
        feePerKb = value(10000000);
        minNonDust = value(1000000); // 0.00001 DOGED mininput
        softDustLimit = value(10000000); // 0.1 DOGED
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static DogecoindarkTest instance = new DogecoindarkTest();
    public static synchronized DogecoindarkTest get() {
        return instance;
    }
}
