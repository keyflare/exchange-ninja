package com.keyflare.exchnage.entities

import com.keyflare.exchnage.entities.CurrencyType.*

enum class CurrencyType { FIAT, CRYPTO }

enum class Currency(
    val ticker: String,
    val displayName: String,
    val type: CurrencyType,
) {
    UNKNOWN("", "", FIAT),

    ONEINCH(ticker = "1INCH", displayName = "1inch Network", type = CRYPTO),
    AAVE(ticker = "AAVE", displayName = "Aave", type = CRYPTO),
    ADA(ticker = "ADA", displayName = "Cardano", type = CRYPTO),
    AED(ticker = "AED", displayName = "United Arab Emirates Dirham", type = FIAT),
    AFN(ticker = "AFN", displayName = "Afghan afghani", type = FIAT),
    ALGO(ticker = "ALGO", displayName = "Algorand", type = CRYPTO),
    ALL(ticker = "ALL", displayName = "Albanian lek", type = FIAT),
    AMD(ticker = "AMD", displayName = "Armenian dram", type = FIAT),
    AMP(ticker = "AMP", displayName = "Synereo", type = CRYPTO),
    ANG(ticker = "ANG", displayName = "Netherlands Antillean Guilder", type = FIAT),
    AOA(ticker = "AOA", displayName = "Angolan kwanza", type = FIAT),
    AR(ticker = "AR", displayName = "Arweave", type = CRYPTO),
    ARS(ticker = "ARS", displayName = "Argentine peso", type = FIAT),
    ATOM(ticker = "ATOM", displayName = "Atomic Coin", type = CRYPTO),
    AUD(ticker = "AUD", displayName = "Australian dollar", type = FIAT),
    AVAX(ticker = "AVAX", displayName = "Avalanche", type = CRYPTO),
    AWG(ticker = "AWG", displayName = "Aruban florin", type = FIAT),
    AXS(ticker = "AXS", displayName = "Axie Infinity", type = CRYPTO),
    AZN(ticker = "AZN", displayName = "Azerbaijani manat", type = FIAT),
    BAM(ticker = "BAM", displayName = "Bosnia-Herzegovina Convertible Mark", type = FIAT),
    BAT(ticker = "BAT", displayName = "Basic Attention Token", type = CRYPTO),
    BBD(ticker = "BBD", displayName = "Bajan dollar", type = FIAT),
    BCH(ticker = "BCH", displayName = "Bitcoin Cash", type = CRYPTO),
    BDT(ticker = "BDT", displayName = "Bangladeshi taka", type = FIAT),
    BGN(ticker = "BGN", displayName = "Bulgarian lev", type = FIAT),
    BHD(ticker = "BHD", displayName = "Bahraini dinar", type = FIAT),
    BIF(ticker = "BIF", displayName = "Burundian Franc", type = FIAT),
    BMD(ticker = "BMD", displayName = "Bermudan dollar", type = FIAT),
    BNB(ticker = "BNB", displayName = "Binance Coin", type = CRYPTO),
    BND(ticker = "BND", displayName = "Brunei dollar", type = FIAT),
    BOB(ticker = "BOB", displayName = "Bolivian boliviano", type = FIAT),
    BRL(ticker = "BRL", displayName = "Brazilian real", type = FIAT),
    BSD(ticker = "BSD", displayName = "Bahamian dollar", type = FIAT),
    BSV(ticker = "BSV", displayName = "Bitcoin SV", type = CRYPTO),
    BTC(ticker = "BTC", displayName = "Bitcoin", type = CRYPTO),
    BTCB(ticker = "BTCB", displayName = "Bitcoin BEP2", type = CRYPTO),
    BTG(ticker = "BTG", displayName = "Bitcoin Gold", type = CRYPTO),
    BTN(ticker = "BTN", displayName = "Bhutan currency", type = FIAT),
    BUSD(ticker = "BUSD", displayName = "Binance USD", type = CRYPTO),
    BWP(ticker = "BWP", displayName = "Botswanan Pula", type = FIAT),
    BYN(ticker = "BYN", displayName = "Belarusian Ruble", type = FIAT),
    BYR(ticker = "BYR", displayName = "Old Belarusian Ruble", type = FIAT), // TODO BLACKLIST
    BZD(ticker = "BZD", displayName = "Belize dollar", type = FIAT),
    CAD(ticker = "CAD", displayName = "Canadian dollar", type = FIAT),
    CAKE(ticker = "CAKE", displayName = "PancakeSwap", type = CRYPTO),
    CDF(ticker = "CDF", displayName = "Congolese franc", type = FIAT),
    CELO(ticker = "CELO", displayName = "Celo", type = CRYPTO),
    CHF(ticker = "CHF", displayName = "Swiss franc", type = FIAT),
    CHZ(ticker = "CHZ", displayName = "Chiliz", type = CRYPTO),
    CLF(ticker = "CLF", displayName = "Chilean Unit of Account (UF)", type = FIAT),
    CLP(ticker = "CLP", displayName = "Chilean peso", type = FIAT),
    CNY(ticker = "CNY", displayName = "Chinese Yuan", type = FIAT),
    COMP(ticker = "COMP", displayName = "Compound", type = CRYPTO),
    COP(ticker = "COP", displayName = "Colombian peso", type = FIAT),
    CRC(ticker = "CRC", displayName = "Costa Rican Colón", type = FIAT),
    CRO(ticker = "CRO", displayName = "Crypto.com Chain Token", type = CRYPTO),
    CRV(ticker = "CRV", displayName = "Curve DAO Token", type = CRYPTO),
    CUC(ticker = "CUC", displayName = "Cuban peso", type = FIAT),
    CUP(ticker = "CUP", displayName = "Cuban Peso", type = FIAT),
    CVE(ticker = "CVE", displayName = "Cape Verdean escudo", type = FIAT),
    CVX(ticker = "CVX", displayName = "Convex Finance", type = CRYPTO),
    CZK(ticker = "CZK", displayName = "Czech koruna", type = FIAT),
    DAI(ticker = "DAI", displayName = "Dai", type = CRYPTO),
    DASH(ticker = "DASH", displayName = "Dash", type = CRYPTO),
    DCR(ticker = "DCR", displayName = "Decred", type = CRYPTO),
    DFI(ticker = "DFI", displayName = "DfiStarter", type = CRYPTO),
    DJF(ticker = "DJF", displayName = "Djiboutian franc", type = FIAT),
    DKK(ticker = "DKK", displayName = "Danish krone", type = FIAT),
    DOGE(ticker = "DOGE", displayName = "Dogecoin", type = CRYPTO),
    DOP(ticker = "DOP", displayName = "Dominican peso", type = FIAT),
    DOT(ticker = "DOT", displayName = "Dotcoin", type = CRYPTO),
    DZD(ticker = "DZD", displayName = "Algerian dinar", type = FIAT),
    EGLD(ticker = "EGLD", displayName = "Elrond", type = CRYPTO),
    EGP(ticker = "EGP", displayName = "Egyptian pound", type = FIAT),
    ENJ(ticker = "ENJ", displayName = "Enjin Coin", type = CRYPTO),
    EOS(ticker = "EOS", displayName = "EOS", type = CRYPTO),
    ERN(ticker = "ERN", displayName = "Eritrean nakfa", type = FIAT),
    ETB(ticker = "ETB", displayName = "Ethiopian birr", type = FIAT),
    ETC(ticker = "ETC", displayName = "Ethereum Classic", type = CRYPTO),
    ETH(ticker = "ETH", displayName = "Ethereum", type = CRYPTO),
    EUR(ticker = "EUR", displayName = "Euro", type = FIAT),
    FEI(ticker = "FEI", displayName = "Fei USD", type = CRYPTO),
    FIL(ticker = "FIL", displayName = "FileCoin", type = CRYPTO),
    FJD(ticker = "FJD", displayName = "Fijian dollar", type = FIAT),
    FKP(ticker = "FKP", displayName = "Falkland Islands pound", type = FIAT),
    FLOW(ticker = "FLOW", displayName = "Flow", type = CRYPTO),
    FRAX(ticker = "FRAX", displayName = "Frax", type = CRYPTO),
    FTM(ticker = "FTM", displayName = "Fantom", type = CRYPTO),
    FTT(ticker = "FTT", displayName = "FarmaTrust", type = CRYPTO),
    GALA(ticker = "GALA", displayName = "Gala", type = CRYPTO),
    GBP(ticker = "GBP", displayName = "Pound sterling", type = FIAT),
    GEL(ticker = "GEL", displayName = "Georgian lari", type = FIAT),
    GGP(ticker = "GGP", displayName = "Guernsey Pound", type = FIAT),
    GHS(ticker = "GHS", displayName = "Ghanaian cedi", type = FIAT),
    GIP(ticker = "GIP", displayName = "Gibraltar pound", type = FIAT),
    GMD(ticker = "GMD", displayName = "Gambian dalasi", type = FIAT),
    GNF(ticker = "GNF", displayName = "Guinean franc", type = FIAT),
    GNO(ticker = "GNO", displayName = "Gnosis", type = CRYPTO),
    GRT(ticker = "GRT", displayName = "Golden Ratio Token", type = CRYPTO),
    GT(ticker = "GT", displayName = "GateToken", type = CRYPTO),
    GTQ(ticker = "GTQ", displayName = "Guatemalan quetzal", type = FIAT),
    GYD(ticker = "GYD", displayName = "Guyanaese Dollar", type = FIAT),
    HBAR(ticker = "HBAR", displayName = "Hedera", type = CRYPTO),
    HKD(ticker = "HKD", displayName = "Hong Kong dollar", type = FIAT),
    HNL(ticker = "HNL", displayName = "Honduran lempira", type = FIAT),
    HNT(ticker = "HNT", displayName = "Helium", type = CRYPTO),
    HOT(ticker = "HOT", displayName = "Hydro Protocol", type = CRYPTO),
    HRK(ticker = "HRK", displayName = "Croatian kuna", type = FIAT),
    HT(ticker = "HT", displayName = "Huobi Token", type = CRYPTO),
    HTG(ticker = "HTG", displayName = "Haitian gourde", type = FIAT),
    HUF(ticker = "HUF", displayName = "Hungarian forint", type = FIAT),
    ICP(ticker = "ICP", displayName = "Internet Computer", type = CRYPTO),
    IDR(ticker = "IDR", displayName = "Indonesian rupiah", type = FIAT),
    ILS(ticker = "ILS", displayName = "Israeli New Shekel", type = FIAT),
    IMP(ticker = "IMP", displayName = "CoinIMP", type = CRYPTO),
    INJ(ticker = "INJ", displayName = "Injective", type = CRYPTO),
    INR(ticker = "INR", displayName = "Indian rupee", type = FIAT),
    IQD(ticker = "IQD", displayName = "Iraqi dinar", type = FIAT),
    IRR(ticker = "IRR", displayName = "Iranian rial", type = FIAT),
    ISK(ticker = "ISK", displayName = "Icelandic króna", type = FIAT),
    JEP(ticker = "JEP", displayName = "Jersey Pound", type = FIAT),
    JMD(ticker = "JMD", displayName = "Jamaican dollar", type = FIAT),
    JOD(ticker = "JOD", displayName = "Jordanian dinar", type = FIAT),
    JPY(ticker = "JPY", displayName = "Japanese yen", type = FIAT),
    KAVA(ticker = "KAVA", displayName = "Kava", type = CRYPTO),
    KCS(ticker = "KCS", displayName = "Kucoin", type = CRYPTO),
    KDA(ticker = "KDA", displayName = "Kadena", type = CRYPTO),
    KES(ticker = "KES", displayName = "Kenyan shilling", type = FIAT),
    KGS(ticker = "KGS", displayName = "Kyrgystani Som", type = FIAT),
    KHR(ticker = "KHR", displayName = "Cambodian riel", type = FIAT),
    KLAY(ticker = "KLAY", displayName = "Klaytn", type = CRYPTO),
    KMF(ticker = "KMF", displayName = "Comorian franc", type = FIAT),
    KNC(ticker = "KNC", displayName = "Kyber Network", type = CRYPTO),
    KPW(ticker = "KPW", displayName = "North Korean won", type = FIAT),
    KRW(ticker = "KRW", displayName = "South Korean won", type = FIAT),
    KSM(ticker = "KSM", displayName = "Kusama", type = CRYPTO),
    KWD(ticker = "KWD", displayName = "Kuwaiti dinar", type = FIAT),
    KYD(ticker = "KYD", displayName = "Cayman Islands dollar", type = FIAT),
    KZT(ticker = "KZT", displayName = "Kazakhstani tenge", type = FIAT),
    LAK(ticker = "LAK", displayName = "Laotian Kip", type = FIAT),
    LBP(ticker = "LBP", displayName = "Lebanese pound", type = FIAT),
    LEO(ticker = "LEO", displayName = "LEOcoin", type = CRYPTO), // TODO BLACKLIST
    LINK(ticker = "LINK", displayName = "ChainLink", type = CRYPTO),
    LKR(ticker = "LKR", displayName = "Sri Lankan rupee", type = FIAT),
    LRC(ticker = "LRC", displayName = "Loopring", type = CRYPTO),
    LRD(ticker = "LRD", displayName = "Liberian dollar", type = FIAT),
    LSL(ticker = "LSL", displayName = "Lesotho loti", type = FIAT),
    LTC(ticker = "LTC", displayName = "Litecoin", type = CRYPTO),
    LTL(ticker = "LTL", displayName = "Lithuanian litas", type = FIAT),
    LUNA(ticker = "LUNA", displayName = "Luna Coin", type = CRYPTO),
    LVL(ticker = "LVL", displayName = "Latvian lats", type = FIAT),
    LYD(ticker = "LYD", displayName = "Libyan dinar", type = FIAT),
    MAD(ticker = "MAD", displayName = "Moroccan dirham", type = FIAT),
    MANA(ticker = "MANA", displayName = "Decentraland", type = CRYPTO),
    MATIC(ticker = "MATIC", displayName = "Polygon", type = CRYPTO),
    MDL(ticker = "MDL", displayName = "Moldovan leu", type = FIAT),
    MGA(ticker = "MGA", displayName = "Malagasy ariary", type = FIAT),
    MINA(ticker = "MINA", displayName = "Mina", type = CRYPTO),
    MIOTA(ticker = "MIOTA", displayName = "IOTA", type = CRYPTO),
    MKD(ticker = "MKD", displayName = "Macedonian denar", type = FIAT),
    MKR(ticker = "MKR", displayName = "Maker", type = CRYPTO),
    MMK(ticker = "MMK", displayName = "Myanmar Kyat", type = FIAT),
    MNT(ticker = "MNT", displayName = "Mongolian tugrik", type = FIAT),
    MOP(ticker = "MOP", displayName = "Macanese pataca", type = FIAT),
    MRO(ticker = "MRO", displayName = "Mauritanian ouguiya", type = FIAT),
    MUR(ticker = "MUR", displayName = "Mauritian rupee", type = FIAT),
    MVR(ticker = "MVR", displayName = "Maldivian rufiyaa", type = FIAT),
    MWK(ticker = "MWK", displayName = "Malawian kwacha", type = FIAT),
    MXN(ticker = "MXN", displayName = "Mexican peso", type = FIAT),
    MYR(ticker = "MYR", displayName = "Malaysian ringgit", type = FIAT),
    MZN(ticker = "MZN", displayName = "Mozambican Metical", type = FIAT),
    NAD(ticker = "NAD", displayName = "Namibian dollar", type = FIAT),
    NEAR(ticker = "NEAR", displayName = "NEAR Protocol", type = CRYPTO),
    NEO(ticker = "NEO", displayName = "NEO", type = CRYPTO),
    NEXO(ticker = "NEXO", displayName = "NEXO", type = CRYPTO),
    NGN(ticker = "NGN", displayName = "Nigerian naira", type = FIAT),
    NIO(ticker = "NIO", displayName = "Nicaraguan córdoba", type = FIAT),
    NOK(ticker = "NOK", displayName = "Norwegian krone", type = FIAT),
    NPR(ticker = "NPR", displayName = "Nepalese rupee", type = FIAT),
    NZD(ticker = "NZD", displayName = "New Zealand dollar", type = FIAT),
    OKB(ticker = "OKB", displayName = "Okex", type = CRYPTO), //TODO BLACKLIST
    OMR(ticker = "OMR", displayName = "Omani rial", type = FIAT),
    ONE(ticker = "ONE", displayName = "Menlo One", type = CRYPTO),
    PAB(ticker = "PAB", displayName = "Panamanian balboa", type = FIAT),
    PAXG(ticker = "PAXG", displayName = "PAX Gold", type = CRYPTO),
    PEN(ticker = "PEN", displayName = "Sol", type = CRYPTO), // TODO BLACKLIST
    PGK(ticker = "PGK", displayName = "Papua New Guinean kina", type = FIAT),
    PHP(ticker = "PHP", displayName = "Philippine peso", type = FIAT),
    PKR(ticker = "PKR", displayName = "Pakistani rupee", type = FIAT),
    PLN(ticker = "PLN", displayName = "Poland złoty", type = FIAT),
    PYG(ticker = "PYG", displayName = "Paraguayan guarani", type = FIAT),
    QAR(ticker = "QAR", displayName = "Qatari Rial", type = FIAT),
    QNT(ticker = "QNT", displayName = "Quant", type = CRYPTO),
    QTUM(ticker = "QTUM", displayName = "QTUM", type = CRYPTO),
    RON(ticker = "RON", displayName = "Romanian leu", type = FIAT),
    RSD(ticker = "RSD", displayName = "Serbian dinar", type = FIAT),
    RUB(ticker = "RUB", displayName = "Russian ruble", type = FIAT),
    RUNE(ticker = "RUNE", displayName = "THORChain (ERC20)", type = CRYPTO),
    RWF(ticker = "RWF", displayName = "Rwandan Franc", type = FIAT),
    SAND(ticker = "SAND", displayName = "BeachCoin", type = CRYPTO),
    SAR(ticker = "SAR", displayName = "Saudi riyal", type = FIAT),
    SBD(ticker = "SBD", displayName = "Solomon Islands dollar", type = FIAT),
    SCR(ticker = "SCR", displayName = "Seychellois rupee", type = FIAT),
    SDG(ticker = "SDG", displayName = "Sudanese pound", type = FIAT),
    SEK(ticker = "SEK", displayName = "Swedish krona", type = FIAT),
    SGD(ticker = "SGD", displayName = "Singapore dollar", type = FIAT),
    SHIB(ticker = "SHIB", displayName = "Shiba Inu", type = CRYPTO),
    SHP(ticker = "SHP", displayName = "Saint Helena pound", type = FIAT),
    SLE(ticker = "SLE", displayName = "Sierra Leonean Leone", type = FIAT),
    SLL(ticker = "SLL", displayName = "Sierra Leonean leone", type = FIAT),
    SOL(ticker = "SOL", displayName = "Solana", type = CRYPTO),
    SOS(ticker = "SOS", displayName = "Somali shilling", type = FIAT),
    SRD(ticker = "SRD", displayName = "Surinamese dollar", type = FIAT),
    STD(ticker = "STD", displayName = "Sao Tomean Dobra", type = FIAT), // TODO BLACKLIST
    STX(ticker = "STX", displayName = "Stox", type = CRYPTO),
    SVC(ticker = "SVC", displayName = "Salvadoran Colón", type = FIAT),
    SYP(ticker = "SYP", displayName = "Syrian pound", type = FIAT),
    SZL(ticker = "SZL", displayName = "Swazi lilangeni", type = FIAT),
    THB(ticker = "THB", displayName = "Thai baht", type = FIAT),
    THETA(ticker = "THETA", displayName = "Theta", type = CRYPTO),
    TJS(ticker = "TJS", displayName = "Tajikistani somoni", type = FIAT),
    TMT(ticker = "TMT", displayName = "Turkmenistani manat", type = FIAT),
    TND(ticker = "TND", displayName = "Tunisian dinar", type = FIAT),
    TOP(ticker = "TOP", displayName = "Tongan Paʻanga", type = FIAT),
    TRX(ticker = "TRX", displayName = "TRON", type = CRYPTO),
    TRY(ticker = "TRY", displayName = "Turkish lira", type = FIAT),
    TTD(ticker = "TTD", displayName = "Trinidad & Tobago Dollar", type = FIAT),
    TTT(ticker = "TTT", displayName = "Tap Project", type = CRYPTO),
    TUSD(ticker = "TUSD", displayName = "True USD", type = CRYPTO),
    TWD(ticker = "TWD", displayName = "New Taiwan dollar", type = FIAT),
    TZS(ticker = "TZS", displayName = "Tanzanian shilling", type = FIAT),
    UAH(ticker = "UAH", displayName = "Ukrainian hryvnia", type = FIAT),
    UGX(ticker = "UGX", displayName = "Ugandan shilling", type = FIAT),
    UNI(ticker = "UNI", displayName = "Universe", type = CRYPTO),
    USD(ticker = "USD", displayName = "United States dollar", type = FIAT),
    USDC(ticker = "USDC", displayName = "USD Coin", type = CRYPTO),
    USDP(ticker = "USDP", displayName = "USDP Stablecoin", type = CRYPTO),
    USDT(ticker = "USDT", displayName = "Tether", type = CRYPTO),
    UYU(ticker = "UYU", displayName = "Uruguayan peso", type = FIAT),
    UZS(ticker = "UZS", displayName = "Uzbekistani som", type = FIAT),
    VEF(ticker = "VEF", displayName = "Sovereign Bolivar", type = FIAT),
    VET(ticker = "VET", displayName = "Vechain", type = CRYPTO),
    VND(ticker = "VND", displayName = "Vietnamese dong", type = FIAT),
    VUV(ticker = "VUV", displayName = "Vanuatu vatu", type = FIAT),
    WAVES(ticker = "WAVES", displayName = "Waves", type = CRYPTO),
    WBTC(ticker = "WBTC", displayName = "Wrapped Bitcoin", type = CRYPTO),
    WEMIX(ticker = "WEMIX", displayName = "WEMIX", type = CRYPTO),
    WST(ticker = "WST", displayName = "Samoan tala", type = FIAT),
    XAF(ticker = "XAF", displayName = "Central African CFA franc", type = FIAT),
    XAG(ticker = "XAG", displayName = "Silver Ounce", type = CRYPTO),
    XAU(ticker = "XAU", displayName = "XauCoin", type = CRYPTO),
    XCD(ticker = "XCD", displayName = "East Caribbean dollar", type = FIAT),
    XCH(ticker = "XCH", displayName = "Chia", type = CRYPTO),
    XDC(ticker = "XDC", displayName = "XDC Network", type = CRYPTO),
    XDR(ticker = "XDR", displayName = "Special Drawing Rights", type = CRYPTO), // TODO BLACKLIST
    XEC(ticker = "XEC", displayName = "Eternal Coin", type = CRYPTO),
    XEM(ticker = "XEM", displayName = "NEM", type = CRYPTO),
    XLM(ticker = "XLM", displayName = "Stellar", type = CRYPTO),
    XMR(ticker = "XMR", displayName = "Monero", type = CRYPTO),
    XOF(ticker = "XOF", displayName = "West African CFA franc", type = FIAT),
    XPF(ticker = "XPF", displayName = "CFP franc", type = FIAT),
    XRP(ticker = "XRP", displayName = "XRP", type = CRYPTO),
    XTZ(ticker = "XTZ", displayName = "Tezos", type = CRYPTO),
    YER(ticker = "YER", displayName = "Yemeni rial", type = FIAT),
    ZAR(ticker = "ZAR", displayName = "South African rand", type = FIAT),
    ZEC(ticker = "ZEC", displayName = "ZCash", type = CRYPTO),
    ZIL(ticker = "ZIL", displayName = "Zilliqa", type = CRYPTO),
    ZMK(ticker = "ZMK", displayName = "Zambian kwacha", type = FIAT),
    ZMW(ticker = "ZMW", displayName = "Zambian Kwacha", type = FIAT),
    ZWL(ticker = "ZWL", displayName = "Zimbabwean Dollar", type = FIAT)
}
