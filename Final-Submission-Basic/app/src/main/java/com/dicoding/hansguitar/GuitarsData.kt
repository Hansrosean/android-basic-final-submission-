package com.dicoding.hansguitar

object GuitarsData {
    private val guitarNames = arrayOf("Fender Stratocaster Player Series",
        "Fender Stratocaster American Ultra",
        "Fender Telecaster 70s Vintera Deluxe",
        "Fender Telecaster American Pro II",
        "Ibanez RG5170B",
        "Ibanez AZ226PB",
        "Gibson Les Paul Modern",
        "Gibson SG Standard",
        "PRS SE Custom 24",
        "PRS S2 Standard 24")

    private val guitarDetails = arrayOf("Fusing classic Fender design with player-centric features and exciting new finishes, the Player Plus Stratocaster HSS delivers superb playability and unmistakable style. The powerful Player Plus humbucking pickup delivers the perfect balance of gain and definition, while the Player Plus Noiseless Strat® pickups are bright and touch sensitive, offering classic Strat tone without hum.",
        "American Ultra is our most advanced series of guitars and basses for discerning players who demand the ultimate in precision, performance and tone. The American Ultra Stratocaster features a unique Modern D neck profile with Ultra rolled fingerboard edges for hours of playing comfort, and the tapered neck heel allows easy access to the highest register.",
        "For players who want the style and sound of Fender’s golden era, we created the Vintera® ‘70s Telecaster® Deluxe. Equipped with the coveted features that defined the decade—including period-accurate neck profile and playing feel, along with re-voiced pickups—this guitar has all of the authentic bite and twang that made the Telecaster a legend.",
        "The American Professional II Telecaster® draws from more than seventy years of innovation, inspiration and evolution to meet the demands of today’s working player. Our popular Deep C neck now sports smooth rolled fingerboard edges, a “Super-Natural” satin finish and a newly sculpted neck heel for a supremely comfortable feel.",
        "The Ibanez Prestige RG5170B is a dream come true for anyone who needs a diverse range of high-gain tones. This axe has an HSH-configured trio of Fishman Fluence Modern pickups that deliver punishing tones.",
        "From its classic aesthetics to its excellent playability and deluxe appointments, the Ibanez AZ226 is a sophisticated entry into the Ibanez AZ lineup. It features a comfortable roasted maple neck and fingerboard for a hearty tone with plenty of snap.",
        "The new Gibson Les Paul™ Modern incorporates many contemporary updates that players have embraced such as a lighter-weight body and innovative SlimTaper™ neck with asymmetrical profile. The Modern fingerboard is crafted with genuine ebony and a compound radius for lower, and cleaner action.",
        "The Gibson SG Standard rocks the classic looks and features associated with the late 60's style SG models sought after by many. A rounded profile mahogany neck, bound rosewood fingerboard, long tenon 19th fret neck joint, and a solid mahogany body provide the backbone for singing sustain.",
        "The SE Custom 24 brings the original PRS design platform to the high-quality, more affordable SE line up of instruments. Played by internationally touring artists, gigging musicians, and aspiring players, the SE Custom 24 features a maple top, mahogany back, wide thin maple neck, rosewood fretboard with bird inlays, and the PRS patented molded tremolo bridge.",
        "With its solid build and versatile electronics platform, the S2 Standard 24 is a true player’s guitar that handles as well as it sounds whether it’s plugged straight into your amp or run through your pedal board.")

    private val guitarMaterial = arrayOf("Alder", "Alder", "Poplar", "Pine", "Basswood", "Basswood", "Mahogany", "Mahogany", "Mahogany", "Alder")

    private val guitarNeck = arrayOf("Pau Ferro", "Maple", "Maple", "Maple", "Ebony", "Roasted Maple", "Ebony", "Rosewood", "Rosewood", "Jatoba")

    private val guitarColor = arrayOf("Belair Blue", "White", "2 Tone Sunburst", "Blonde", "Black", "Cerulean Blue Burst", "Graphite Black", "Cherry Red", "Black Gold Burst", "Black")

    private val guitarPrice = arrayOf("$1,029.99", "$2,499.99", "$1,559.99", "$1,699.99", "$1,499.99", "$1,199.99", "$3,499.99", "$3,299.99", "$799.99", "$999.99")

    private val guitarsImages = intArrayOf(R.drawable.strat_playerplus,
        R.drawable.strat_americanultra,
        R.drawable.tele_vinteradeluxe,
        R.drawable.tele_americanproii,
        R.drawable.ibanez_rg5170b,
        R.drawable.ibanez_az226pb,
        R.drawable.lespaul_modern,
        R.drawable.sg_standard,
        R.drawable.se_custom24,
        R.drawable.s2_standard24)

    val listData: ArrayList<Guitar>
        get() {
            val list = arrayListOf<Guitar>()
            for (position in guitarNames.indices) {
                val guitar = Guitar()
                guitar.picture = guitarsImages[position]
                guitar.name = guitarNames[position]
                guitar.detail = guitarDetails[position]
                guitar.material = guitarMaterial[position]
                guitar.neck = guitarNeck[position]
                guitar.color = guitarColor[position]
                guitar.price = guitarPrice[position]
                list.add(guitar)
            }
            return list
        }
}