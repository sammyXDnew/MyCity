package com.example.mycity.data

object LocalPlacesDataProvider {

    private val places = listOf(
        // ---- Wisata Air & Alam ----
        Place(
            1, "Umbul Ponggok", "Polanharjo",
            "Umbul Ponggok merupakan objek wisata air yang terletak di Desa Ponggok, Kecamatan Polanharjo, Kabupaten Klaten, Jawa Tengah. Umbul ini merupakan sumber mata air alami yang memiliki air jernih dan berasal dari sumber bawah tanah. Tempat ini terkenal sebagai salah satu destinasi wisata air yang menawarkan pengalaman berenang, snorkeling, dan fotografi bawah air. Di dalam kolam terdapat berbagai jenis ikan air tawar yang hidup berdampingan dengan pengunjung. Keunikan Umbul Ponggok terletak pada kejernihan airnya serta keberadaan berbagai properti fotografi di bawah air yang menjadi daya tarik wisatawan.",
            CityCategory.WISATA_ALAM, "🏊", "umbul_ponggok"
        ),
        Place(
            2, "Umbul Manten", "Kebonarum",
            "Umbul Manten merupakan salah satu objek wisata mata air alami yang berada di wilayah Kecamatan Polanharjo, Kabupaten Klaten. Tempat ini dikenal dengan suasana alamnya yang masih asri dan dikelilingi pepohonan besar yang memberikan kesan teduh. Airnya berasal dari mata air alami sehingga terlihat jernih dan menyegarkan. Umbul Manten menjadi salah satu destinasi wisata yang cocok untuk menikmati suasana alam, berenang, dan bersantai bersama keluarga. Keindahan tempat ini juga didukung oleh lingkungan sekitar yang masih mempertahankan nuansa alami pedesaan.",
            CityCategory.WISATA_ALAM, "💧", "umbul_manten"
        ),
        Place(
            3, "Rawa Jombor", "Bayat",
            "Rawa Jombor merupakan kawasan perairan yang terletak di Desa Krakitan, Kecamatan Bayat, Kabupaten Klaten, Jawa Tengah. Rawa ini memiliki fungsi penting sebagai tempat penampungan air untuk mendukung kebutuhan irigasi pertanian di wilayah sekitarnya. Selain memiliki fungsi sebagai sumber pengairan, Rawa Jombor juga berkembang menjadi salah satu destinasi wisata alam di Kabupaten Klaten. Kawasan ini terkenal dengan pemandangan perairan yang luas, perbukitan di sekitarnya, serta keberadaan warung apung yang menyediakan berbagai hidangan ikan air tawar. Pengunjung dapat menikmati pemandangan alam sambil bersantai dan mencicipi makanan khas yang tersedia di kawasan tersebut.",
            CityCategory.WISATA_ALAM, "🌅", "rawa_jombor"
        ),
        Place(
            4, "Umbul Cokro", "Tulung",
            "Umbul Cokro atau dikenal juga sebagai Objek Mata Air Cokro (OMAC) merupakan tempat wisata air yang terletak di Desa Cokro, Kecamatan Tulung, Kabupaten Klaten. Objek wisata ini memanfaatkan sumber mata air alami yang melimpah sebagai daya tarik utamanya. Kawasan wisata ini memiliki kolam renang alami serta berbagai fasilitas rekreasi air yang dapat dinikmati oleh pengunjung. Selain kolam renang, terdapat pula berbagai wahana permainan air yang menjadikan tempat ini sebagai salah satu tujuan wisata keluarga. Keunggulan Umbul Cokro adalah sumber airnya yang jernih dan lingkungan alam yang mendukung kegiatan rekreasi.",
            CityCategory.WISATA_ALAM, "🌊", "umbul_cokro"
        ),

        // ---- Candi & Budaya ----
        Place(
            5, "Candi Plaosan", "Prambanan",
            "Candi Plaosan merupakan kompleks bangunan candi Buddha yang terletak di Desa Bugisan, Kecamatan Prambanan, Kabupaten Klaten, Jawa Tengah. Candi ini diperkirakan dibangun pada pertengahan abad ke-9, pada masa Kerajaan Mataram Kuno. Pembangunannya dikaitkan dengan Sri Kahulunnan atau Pramodhawardhani, putri Raja Samaratungga dari Dinasti Syailendra yang menikah dengan Rakai Pikatan. Kompleks Candi Plaosan terdiri atas dua kelompok utama, yaitu Plaosan Lor dan Plaosan Kidul. Candi ini memiliki bangunan utama, stupa, arca, serta berbagai relief yang menunjukkan keindahan seni arsitektur pada masa Hindu-Buddha. Keunikan Candi Plaosan terlihat dari perpaduan unsur sejarah, agama, dan kebudayaan yang tercermin dalam bentuk bangunannya.",
            CityCategory.CANDI_BUDAYA, "🛕", "candi_plaosan"
        ),
        Place(
            6, "Candi Sewu", "Prambanan",
            "Candi Sewu merupakan kompleks candi Buddha yang terletak di Kecamatan Prambanan, Kabupaten Klaten, Jawa Tengah. Candi ini diperkirakan dibangun pada abad ke-8 dan merupakan salah satu kompleks candi Buddha terbesar di Indonesia setelah Candi Borobudur. Nama Sewu berasal dari bahasa Jawa yang berarti seribu, meskipun jumlah bangunan candi di kompleks ini sebenarnya sebanyak 249 bangunan. Kompleks Candi Sewu memiliki satu candi utama yang dikelilingi oleh sejumlah candi pendamping dan candi perwara. Arsitekturnya memperlihatkan keahlian masyarakat pada masa Kerajaan Mataram Kuno dalam membangun bangunan keagamaan menggunakan batu andesit. Candi Sewu juga menjadi salah satu bukti penting perkembangan agama Buddha di Pulau Jawa.",
            CityCategory.CANDI_BUDAYA, "🏛️", "candi_sewu"
        ),
        Place(
            7, "Makam Sunan Pandanaran", "Bayat",
            "Makam Sunan Pandanaran merupakan salah satu tempat wisata religi yang terletak di Desa Paseban, Kecamatan Bayat, Kabupaten Klaten, Jawa Tengah. Makam ini berkaitan dengan tokoh penyebar agama Islam yang dikenal dengan nama Sunan Bayat atau Sunan Pandanaran II. Beliau dikenal dalam tradisi sejarah dan cerita masyarakat sebagai salah satu murid Sunan Kalijaga yang berperan dalam penyebaran agama Islam di wilayah Jawa. Kompleks makam berada di kawasan perbukitan dan memiliki tangga yang harus dilalui pengunjung untuk mencapai area makam utama. Salah satu keunikan kompleks ini adalah keberadaan dua gentong berukir naga yang dikenal dengan nama Gentong Sinogo. Hingga sekarang, tempat ini banyak dikunjungi masyarakat untuk berziarah sekaligus mengenal sejarah penyebaran Islam di wilayah Klaten.",
            CityCategory.CANDI_BUDAYA, "🕌", "makam_sunan_pandanaran"
        ),
        Place(
            8, "Sebaran Apem Yaa Qowiyyu", "Jatinom",
            "Yaa Qowiyyu merupakan tradisi keagamaan dan kebudayaan masyarakat yang diselenggarakan di Kecamatan Jatinom, Kabupaten Klaten, Jawa Tengah. Tradisi ini dilaksanakan setiap bulan Sapar dalam kalender Jawa dan dikenal juga dengan sebutan Saparan. Kegiatan utamanya adalah membagikan atau menyebarkan kue apem kepada masyarakat yang hadir dalam acara tersebut. Tradisi ini berkaitan dengan kisah Ki Ageng Gribig, seorang tokoh penyebar agama Islam di wilayah Jatinom. Nama Yaa Qowiyyu berasal dari penggalan doa berbahasa Arab yang memiliki makna memohon kekuatan kepada Allah SWT. Ribuan kue apem biasanya disiapkan dan dibagikan dari tempat khusus di sekitar kompleks masjid dan makam Ki Ageng Gribig. Tradisi ini menjadi salah satu bentuk perpaduan antara nilai keagamaan dan budaya Jawa yang masih dilestarikan hingga sekarang.",
            CityCategory.CANDI_BUDAYA, "🎉", "apem_yaa_qowiyyu"
        ),

        // ---- Kuliner & Kerajinan ----
        Place(
            9, "Enting-enting Gepuk", "Klaten",
            "Enting-enting gepuk merupakan makanan tradisional Indonesia yang dikenal sebagai salah satu oleh-oleh khas Kota Salatiga, Jawa Tengah. Makanan ini dibuat menggunakan bahan utama kacang tanah yang dicampur dengan gula sehingga menghasilkan perpaduan rasa manis dan gurih. Proses pembuatannya melibatkan pengolahan dan penumbukan kacang tanah hingga menghasilkan tekstur yang khas. Enting-enting gepuk umumnya memiliki bentuk menyerupai prisma segitiga dan dibungkus menggunakan kertas khusus. Makanan tradisional ini menjadi salah satu produk kuliner yang dikenal masyarakat karena cita rasanya yang khas serta daya tahannya sebagai makanan oleh-oleh.",
            CityCategory.KULINER_KERAJINAN, "🥜", "enting_enting_gepuk"
        ),
        Place(
            10, "Soto Khas Klaten", "Berbagai warung di Klaten",
            "Soto Garing merupakan salah satu kuliner khas Kabupaten Klaten, Jawa Tengah. Kuliner ini memiliki keunikan dalam penyajiannya yang berbeda dari soto ayam pada umumnya. Soto Garing dikenal dengan penggunaan kuah yang sedikit sehingga memberikan kesan lebih kering dibandingkan soto berkuah. Hidangan ini biasanya terdiri dari nasi putih, suwiran daging ayam, tauge, seledri, dan bawang goreng yang dilengkapi dengan kuah kaldu berbumbu rempah. Perpaduan bahan tersebut menghasilkan cita rasa gurih dan aroma khas kaldu ayam. Soto Garing menjadi salah satu pilihan kuliner yang dapat ditemukan di Klaten dan merupakan bagian dari kekayaan kuliner tradisional daerah tersebut.",
            CityCategory.KULINER_KERAJINAN, "🍜", "soto_klaten"
        ),
        Place(
            11, "Gerabah Melikan", "Wedi",
            "Gerabah Melikan merupakan salah satu kerajinan tradisional yang berasal dari Desa Melikan, Kecamatan Wedi, Kabupaten Klaten, Jawa Tengah. Desa ini dikenal sebagai salah satu sentra pembuatan gerabah yang telah mempertahankan keterampilan tradisional secara turun-temurun. Kerajinan gerabah dibuat menggunakan bahan dasar tanah liat yang dibentuk menjadi berbagai perlengkapan rumah tangga maupun benda hias. Salah satu keunikan gerabah Melikan adalah penggunaan teknik putaran miring atau perbot miring dalam proses pembuatannya. Teknik tersebut menjadi ciri khas yang membedakan gerabah Melikan dengan produk gerabah dari daerah lain. Hasil kerajinannya meliputi berbagai bentuk wadah, pot, kendi, dan perlengkapan rumah tangga lainnya. Keberadaan kerajinan ini menjadi bagian penting dari identitas budaya serta kegiatan ekonomi masyarakat setempat.",
            CityCategory.KULINER_KERAJINAN, "🏺", "gerabah_melikan"
        ),
        Place(
            12, "Lurik Cawas", "Cawas",
            "Lurik Cawas merupakan salah satu kerajinan tekstil tradisional yang berkembang di wilayah Kecamatan Cawas, Kabupaten Klaten, Jawa Tengah. Lurik adalah kain tradisional yang dibuat menggunakan teknik tenun dengan benang-benang yang disusun membentuk pola garis-garis. Kain ini memiliki nilai budaya karena telah menjadi bagian dari kehidupan masyarakat Jawa sejak dahulu. Proses pembuatannya dilakukan dengan menyusun benang melalui alat tenun sehingga menghasilkan kain dengan berbagai kombinasi warna dan motif. Salah satu sentra pengembangan kain lurik di wilayah Cawas berada di Desa Tlingsing. Kerajinan lurik tidak hanya menghasilkan produk berupa kain untuk pakaian tradisional, tetapi juga dikembangkan menjadi berbagai produk seperti baju, tas, dan aksesori. Keberadaan industri lurik turut membantu mempertahankan warisan budaya sekaligus mendukung perekonomian masyarakat setempat.",
            CityCategory.KULINER_KERAJINAN, "🧵", "lurik_cawas"
        )
    )

    fun getPlacesByCategory(category: CityCategory): List<Place> =
        places.filter { it.category == category }
}
