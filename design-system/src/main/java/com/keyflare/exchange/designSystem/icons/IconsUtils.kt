package com.keyflare.exchange.designSystem.icons

import androidx.compose.ui.graphics.vector.ImageVector
import com.keyflare.exchange.designSystem.icons.crypto.CryptoIcons
import com.keyflare.exchange.designSystem.icons.crypto.cryptoicons.*
import com.keyflare.exchange.designSystem.icons.flags.FlagIcons
import com.keyflare.exchange.designSystem.icons.flags.flagicons.*
import com.keyflare.exchange.entities.Currency
import com.keyflare.exchange.entities.Currency.*

private val currencyIconsMap = mapOf(

    // Fiat currencies

    AED to FlagIcons.Aed,
    AFN to FlagIcons.Afn,
    ALL to FlagIcons.All,
    AMD to FlagIcons.Amd,
    ANG to FlagIcons.Ang,
    AOA to FlagIcons.Aoa,
    ARS to FlagIcons.Ars,
    AUD to FlagIcons.Aud,
    AWG to FlagIcons.Awg,
    AZN to FlagIcons.Azn,
    BAM to FlagIcons.Bam,
    BBD to FlagIcons.Bbd,
    BDT to FlagIcons.Bdt,
    BGN to FlagIcons.Bgn,
    BHD to FlagIcons.Bhd,
    BIF to FlagIcons.Bif,
    BMD to FlagIcons.Bmd,
    BND to FlagIcons.Bnd,
    BOB to FlagIcons.Bob,
    BRL to FlagIcons.Brl,
    BSD to FlagIcons.Bsd,
    BTN to FlagIcons.Btn,
    BWP to FlagIcons.Bwp,
    BYN to FlagIcons.Byn,
    BZD to FlagIcons.Bzd,
    CAD to FlagIcons.Cad,
    CDF to FlagIcons.Cdf,
    CHF to FlagIcons.Chf,
    CLF to FlagIcons.Clf,
    CLP to FlagIcons.Clp,
    CNY to FlagIcons.Cny,
    COP to FlagIcons.Cop,
    CRC to FlagIcons.Crc,
    CUC to FlagIcons.Cuc,
    CUP to FlagIcons.Cup,
    CVE to FlagIcons.Cve,
    CZK to FlagIcons.Czk,
    DJF to FlagIcons.Djf,
    DKK to FlagIcons.Dkk,
    DOP to FlagIcons.Dop,
    DZD to FlagIcons.Dzd,
    EGP to FlagIcons.Egp,
    ERN to FlagIcons.Ern,
    ETB to FlagIcons.Etb,
    EUR to FlagIcons.Eur,
    FJD to FlagIcons.Fjd,
    FKP to FlagIcons.Fkp,
    GBP to FlagIcons.Gbp,
    GEL to FlagIcons.Gel,
    GGP to FlagIcons.Ggp,
    GHS to FlagIcons.Ghs,
    GIP to FlagIcons.Gip,
    GMD to FlagIcons.Gmd,
    GNF to FlagIcons.Gnf,
    GTQ to FlagIcons.Gtq,
    GYD to FlagIcons.Gyd,
    HKD to FlagIcons.Hkd,
    HNL to FlagIcons.Hnl,
    HRK to FlagIcons.Hrk,
    HTG to FlagIcons.Htg,
    HUF to FlagIcons.Huf,
    IDR to FlagIcons.Idr,
    ILS to FlagIcons.Ils,
    INR to FlagIcons.Inr,
    IQD to FlagIcons.Iqd,
    IRR to FlagIcons.Irr,
    ISK to FlagIcons.Isk,
    JEP to FlagIcons.Jep,
    JMD to FlagIcons.Jmd,
    JOD to FlagIcons.Jod,
    JPY to FlagIcons.Jpy,
    KES to FlagIcons.Kes,
    KGS to FlagIcons.Kgs,
    KHR to FlagIcons.Khr,
    KMF to FlagIcons.Kmf,
    KPW to FlagIcons.Kpw,
    KRW to FlagIcons.Krw,
    KWD to FlagIcons.Kwd,
    KYD to FlagIcons.Kyd,
    KZT to FlagIcons.Kzt,
    LAK to FlagIcons.Lak,
    LBP to FlagIcons.Lbp,
    LKR to FlagIcons.Lkr,
    LRD to FlagIcons.Lrd,
    LSL to FlagIcons.Lsl,
    LTL to FlagIcons.Ltl,
    LVL to FlagIcons.Lvl,
    LYD to FlagIcons.Lyd,
    MAD to FlagIcons.Mad,
    MDL to FlagIcons.Mdl,
    MGA to FlagIcons.Mga,
    MKD to FlagIcons.Mkd,
    MMK to FlagIcons.Mmk,
    MNT to FlagIcons.Mnt,
    MOP to FlagIcons.Mop,
    MRO to FlagIcons.Mro,
    MUR to FlagIcons.Mur,
    MVR to FlagIcons.Mvr,
    MWK to FlagIcons.Mwk,
    MXN to FlagIcons.Mxn,
    MYR to FlagIcons.Myr,
    MZN to FlagIcons.Mzn,
    NAD to FlagIcons.Nad,
    NGN to FlagIcons.Ngn,
    NIO to FlagIcons.Nio,
    NOK to FlagIcons.Nok,
    NPR to FlagIcons.Npr,
    NZD to FlagIcons.Nzd,
    OMR to FlagIcons.Omr,
    PAB to FlagIcons.Pab,
    PGK to FlagIcons.Pgk,
    PHP to FlagIcons.Php,
    PKR to FlagIcons.Pkr,
    PLN to FlagIcons.Pln,
    PYG to FlagIcons.Pyg,
    QAR to FlagIcons.Qar,
    RON to FlagIcons.Ron,
    RSD to FlagIcons.Rsd,
    RUB to FlagIcons.Rub,
    RWF to FlagIcons.Rwf,
    SAR to FlagIcons.Sar,
    SBD to FlagIcons.Sbd,
    SCR to FlagIcons.Scr,
    SDG to FlagIcons.Sdg,
    SEK to FlagIcons.Sek,
    SGD to FlagIcons.Sgd,
    SHP to FlagIcons.Shp,
    SLE to FlagIcons.Sle,
    SLL to FlagIcons.Sll,
    SOS to FlagIcons.Sos,
    SRD to FlagIcons.Srd,
    SVC to FlagIcons.Svc,
    SYP to FlagIcons.Syp,
    SZL to FlagIcons.Szl,
    THB to FlagIcons.Thb,
    TJS to FlagIcons.Tjs,
    TMT to FlagIcons.Tmt,
    TND to FlagIcons.Tnd,
    TOP to FlagIcons.Top,
    TRY to FlagIcons.Try,
    TTD to FlagIcons.Ttd,
    TWD to FlagIcons.Twd,
    TZS to FlagIcons.Tzs,
    UAH to FlagIcons.Uah,
    UGX to FlagIcons.Ugx,
    USD to FlagIcons.Usd,
    UYU to FlagIcons.Uyu,
    UZS to FlagIcons.Uzs,
    VEF to FlagIcons.Vef,
    VND to FlagIcons.Vnd,
    VUV to FlagIcons.Vuv,
    WST to FlagIcons.Wst,
    XAF to FlagIcons.Xaf,
    XCD to FlagIcons.Xcd,
    XOF to FlagIcons.Xof,
    XPF to FlagIcons.Xpf,
    YER to FlagIcons.Yer,
    ZAR to FlagIcons.Zar,
    ZMK to FlagIcons.Zmk,
    ZMW to FlagIcons.Zmw,
    ZWL to FlagIcons.Zwl,

    // Crypto currencies

    ONEINCH to CryptoIcons.Oneinch,
    AAVE to CryptoIcons.Aave,
    ADA to CryptoIcons.Ada,
    ALGO to CryptoIcons.Algo,
    AMP to CryptoIcons.Amp,
    AR to CryptoIcons.Ar,
    ATOM to CryptoIcons.Atom,
    AVAX to CryptoIcons.Avax,
    AXS to CryptoIcons.Axs,
    BAT to CryptoIcons.Bat,
    BCH to CryptoIcons.Bch,
    BNB to CryptoIcons.Bnb,
    BSV to CryptoIcons.Bsv,
    BTC to CryptoIcons.Btc,
    BTCB to CryptoIcons.Btcb,
    BTG to CryptoIcons.Btg,
    BUSD to CryptoIcons.Busd,
    CAKE to CryptoIcons.Cake,
    CELO to CryptoIcons.Celo,
    CHZ to CryptoIcons.Chz,
    COMP to CryptoIcons.Comp,
    CRO to CryptoIcons.Cro,
    CRV to CryptoIcons.Crv,
    CVX to CryptoIcons.Cvx,
    DAI to CryptoIcons.Dai,
    DASH to CryptoIcons.Dash,
    DCR to CryptoIcons.Dcr,
    DFI to CryptoIcons.Dfi,
    DOGE to CryptoIcons.Doge,
    DOT to CryptoIcons.Dot,
    EGLD to CryptoIcons.Egld,
    ENJ to CryptoIcons.Enj,
    EOS to CryptoIcons.Eos,
    ETC to CryptoIcons.Etc,
    ETH to CryptoIcons.Eth,
    FEI to CryptoIcons.Fei,
    FIL to CryptoIcons.Fil,
    FLOW to CryptoIcons.Flow,
    FRAX to CryptoIcons.Frax,
    FTM to CryptoIcons.Ftm,
    FTT to CryptoIcons.Ftt,
    GALA to CryptoIcons.Gala,
    GNO to CryptoIcons.Gno,
    GRT to CryptoIcons.Grt,
    GT to CryptoIcons.Gt,
    HBAR to CryptoIcons.Hbar,
    HNT to CryptoIcons.Hnt,
    HOT to CryptoIcons.Hot,
    HT to CryptoIcons.Ht,
    ICP to CryptoIcons.Icp,
    INJ to CryptoIcons.Inj,
    KAVA to CryptoIcons.Kava,
    KCS to CryptoIcons.Kcs,
    KDA to CryptoIcons.Kda,
    KLAY to CryptoIcons.Klay,
    KNC to CryptoIcons.Knc,
    KSM to CryptoIcons.Ksm,
    LINK to CryptoIcons.Link,
    LRC to CryptoIcons.Lrc,
    LTC to CryptoIcons.Ltc,
    LUNA to CryptoIcons.Luna,
    MANA to CryptoIcons.Mana,
    MATIC to CryptoIcons.Matic,
    MINA to CryptoIcons.Mina,
    MIOTA to CryptoIcons.Miota,
    MKR to CryptoIcons.Mkr,
    NEAR to CryptoIcons.Near,
    NEO to CryptoIcons.Neo,
    NEXO to CryptoIcons.Nexo,
    ONE to CryptoIcons.One,
    PAXG to CryptoIcons.Paxg,
    QNT to CryptoIcons.Qnt,
    QTUM to CryptoIcons.Qtum,
    RUNE to CryptoIcons.Rune,
    SAND to CryptoIcons.Sand,
    SHIB to CryptoIcons.Shib,
    SOL to CryptoIcons.Sol,
    STX to CryptoIcons.Stx,
    THETA to CryptoIcons.Theta,
    TRX to CryptoIcons.Trx,
    TTT to CryptoIcons.Ttt,
    TUSD to CryptoIcons.Tusd,
    UNI to CryptoIcons.Uni,
    USDC to CryptoIcons.Usdc,
    USDP to CryptoIcons.Usdp,
    USDT to CryptoIcons.Usdt,
    VET to CryptoIcons.Vet,
    WAVES to CryptoIcons.Waves,
    WBTC to CryptoIcons.Wbtc,
    WEMIX to CryptoIcons.Wemix,
    XCH to CryptoIcons.Xch,
    XDC to CryptoIcons.Xdc,
    XEC to CryptoIcons.Xec,
    XEM to CryptoIcons.Xem,
    XLM to CryptoIcons.Xlm,
    XMR to CryptoIcons.Xmr,
    XRP to CryptoIcons.Xrp,
    XTZ to CryptoIcons.Xtz,
    ZEC to CryptoIcons.Zec,
    ZIL to CryptoIcons.Zil,
)

fun Currency.getIcon(): ImageVector {
    return requireNotNull(currencyIconsMap[this])
}