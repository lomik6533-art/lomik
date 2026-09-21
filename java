const palettes = [
    { title: "Морская классика", category: "Классика", desc: "Тёмно-синий, белый и серый", colors: ["#1e3a5f", "#ffffff", "#8b8b8b"], labels: ["Брюки", "Рубашка", "Ремень"], image: "https://i.pinimg.com/736x/18/9e/98/189e9894332de97ca954ed64ee527d33.jpg", pinterestQuery: "navy white gray classic outfit fashion" },
    { title: "Чёрный и беж", category: "Классика", desc: "Утончённый минимализм", colors: ["#000000", "#d4b896", "#f5f5dc"], labels: ["Пальто", "Свитер", "Шарф"], image: "https://images.unsplash.com/photo-1515886657613-9f3515b0c78f?w=800&q=80", pinterestQuery: "black beige minimalist outfit fashion" },
    { title: "Серый монохром", category: "Классика", desc: "Оттенки серого", colors: ["#2d2d2d", "#808080", "#c0c0c0"], labels: ["Пиджак", "Брюки", "Футболка"], image: "https://images.unsplash.com/photo-1552374196-1ab2a1c593e8?w=800&q=80", pinterestQuery: "gray monochrome outfit fashion" },
    { title: "Белый и деним", category: "Классика", desc: "Свежесть и комфорт", colors: ["#ffffff", "#4a5f7f", "#8b7355"], labels: ["Футболка", "Джинсы", "Ремень"], image: "https://i.pinimg.com/originals/83/17/85/831785e92fd151502df3989bea5c621a.jpg", pinterestQuery: "white denim casual outfit fashion" },
    { title: "Кремовая элегантность", category: "Классика", desc: "Нейтральная палитра", colors: ["#f5f5dc", "#d4c4b0", "#8b7d6b"], labels: ["Платье", "Жакет", "Сумка"], image: "https://images.unsplash.com/photo-1595777457583-95e059d581b8?w=800&q=80", pinterestQuery: "cream beige elegant outfit fashion" },
    { title: "Тёмная классика", category: "Классика", desc: "Строгий стиль", colors: ["#1a1a1a", "#2d2d2d", "#4a4a4a"], labels: ["Костюм", "Рубашка", "Галстук"], image: "https://images.unsplash.com/photo-1507679799987-c73779587ccf?w=800&q=80", pinterestQuery: "dark classic suit outfit fashion" },
    { title: "Офисный шик", category: "Деловой", desc: "Серый с голубым", colors: ["#4a4a4a", "#87ceeb", "#ffffff"], labels: ["Костюм", "Рубашка", "Платок"], image: "https://images.unsplash.com/photo-1573496359142-b8d87734a5a2?w=800&q=80", pinterestQuery: "office business gray blue outfit" },
    { title: "Мягкая сила", category: "Деловой", desc: "Синий с розовым", colors: ["#1e3a5f", "#ffb6c1", "#a9a9a9"], labels: ["Пиджак", "Блузка", "Сумка"], image: "https://images.unsplash.com/photo-1594633312681-425c7b97ccd1?w=800&q=80", pinterestQuery: "navy pink business outfit women" },
    { title: "Бордо и беж", category: "Деловой", desc: "Статусный образ", colors: ["#800020", "#d4b896", "#ffffff"], labels: ["Юбка", "Блузка", "Туфли"], image: "https://i.pinimg.com/originals/90/81/70/9081706dbb5be357e34cebef337e2607.jpg?nii=t", pinterestQuery: "burgundy beige business outfit" },
    { title: "Изумрудный офис", category: "Деловой", desc: "Зелёный деловой", colors: ["#2f4f2f", "#f5f5dc", "#8b7355"], labels: ["Пиджак", "Брюки", "Ремень"], image: "https://images.unsplash.com/photo-1524504388940-b1c1722653e1?w=800&q=80", pinterestQuery: "emerald green business outfit" },
    { title: "Графит и пудра", category: "Деловой", desc: "Современный бизнес", colors: ["#36454f", "#f4c2c2", "#d3d3d3"], labels: ["Брюки", "Блузка", "Жакет"], image: "https://i.pinimg.com/736x/69/bc/bd/69bcbd206a97a37083ca8c25fe8abb85.jpg", pinterestQuery: "graphite powder pink business outfit" },
    { title: "Нави и крем", category: "Деловой", desc: "Классический деловой", colors: ["#001f3f", "#f5f5dc", "#8b7d6b"], labels: ["Костюм", "Рубашка", "Туфли"], image: "https://images.unsplash.com/photo-1551028719-00167b16eac5?w=800&q=80", pinterestQuery: "navy cream business professional outfit" },
    { title: "Солнце и море", category: "Яркие", desc: "Жёлтый с синим", colors: ["#ffd700", "#1e3a5f", "#ffffff"], labels: ["Свитер", "Джинсы", "Кеды"], image: "https://i.pinimg.com/originals/fb/3d/6e/fb3d6eaaf7830a37f05b19d3eda4c1bc.jpg", pinterestQuery: "yellow navy blue casual outfit" },
    { title: "Коралловый риф", category: "Яркие", desc: "Коралл и бирюза", colors: ["#ff7f50", "#40e0d0", "#f5f5dc"], labels: ["Платье", "Кардиган", "Сумка"], image: "https://i.pinimg.com/originals/90/81/70/9081706dbb5be357e34cebef337e2607.jpg?nii=t", pinterestQuery: "coral turquoise outfit fashion" },
    { title: "Фиалка и горчица", category: "Яркие", desc: "Арт-сочетание", colors: ["#800080", "#ffdb58", "#808080"], labels: ["Юбка", "Свитер", "Ботинки"], image: "https://i.pinimg.com/originals/3e/2e/d4/3e2ed43e98bd871398fb8be7d5557dea.jpg", pinterestQuery: "purple mustard yellow outfit fashion" },
    { title: "Электро-синий", category: "Яркие", desc: "Синий с оранжевым", colors: ["#0047ab", "#ff8c00", "#f0f0f0"], labels: ["Куртка", "Шарф", "Брюки"], image: "https://i.pinimg.com/736x/0a/f5/7a/0af57a6dc40aa50a763defe6a500c5ca.jpg", pinterestQuery: "electric blue orange outfit street style" },
    { title: "Малиновый взрыв", category: "Яркие", desc: "Яркий розовый", colors: ["#e91e63", "#2196f3", "#ffffff"], labels: ["Платье", "Жакет", "Туфли"], image: "https://i.pinimg.com/474x/63/d7/81/63d781af8eb69487b4a7d8c3f2813f51.jpg", pinterestQuery: "raspberry pink blue outfit fashion" },
    { title: "Лайм и фуксия", category: "Яркие", desc: "Неоновый контраст", colors: ["#32cd32", "#ff1493", "#000000"], labels: ["Топ", "Юбка", "Кеды"], image: "https://images.unsplash.com/photo-1523381210434-271e8be1f52b?w=800&q=80", pinterestQuery: "lime fuchsia neon outfit fashion" },
    { title: "Мятный сон", category: "Пастельные", desc: "Мята с розовым", colors: ["#98ff98", "#ffb6c1", "#ffffff"], labels: ["Юбка", "Топ", "Кардиган"], image: "https://basket-10.wbbasket.ru/vol1454/part145416/145416245/images/big/1.webp", pinterestQuery: "mint pink pastel outfit fashion" },
    { title: "Лавандовое утро", category: "Пастельные", desc: "Лаванда и серый", colors: ["#e6e6fa", "#a9a9a9", "#f5f5dc"], labels: ["Платье", "Жакет", "Сумка"], image: "https://i.pinimg.com/736x/6d/ea/b2/6deab22c0f055bfa3b3d9b598ef3e9d6.jpg", pinterestQuery: "lavender gray pastel outfit" },
    { title: "Персиковый рассвет", category: "Пастельные", desc: "Персик с голубым", colors: ["#ffdab9", "#add8e6", "#ffffff"], labels: ["Блузка", "Юбка", "Туфли"], image: "https://images.unsplash.com/photo-1502716119720-b23a93e5fe1b?w=800&q=80", pinterestQuery: "peach blue pastel outfit fashion" },
    { title: "Небесная ваниль", category: "Пастельные", desc: "Голубой и крем", colors: ["#b0d4f1", "#fff8dc", "#d4b896"], labels: ["Рубашка", "Брюки", "Ремень"], image: "https://i.pinimg.com/736x/7c/b2/78/7cb27868811e616c644c7558d83a6943.jpg", pinterestQuery: "sky blue cream vanilla outfit" },
    { title: "Пыльная роза", category: "Пастельные", desc: "Розовый с серым", colors: ["#d4a0a0", "#b8b8b8", "#f5f5f5"], labels: ["Платье", "Кардиган", "Сумка"], image: "https://i.pinimg.com/736x/c3/4b/3d/c34b3d36764d31894c53fdffc588864a.jpg", pinterestQuery: "dusty rose gray pastel outfit" },
    { title: "Мятный бриз", category: "Пастельные", desc: "Мята и лаванда", colors: ["#98d8c8", "#e6e6fa", "#ffffff"], labels: ["Юбка", "Блузка", "Жакет"], image: "https://avatars.mds.yandex.net/i?id=70290d672ea9be8428cbfb6e1e2a307f1ebd4249-5443562-images-thumbs&n=13", pinterestQuery: "mint lavender pastel outfit" },
    { title: "Осенний лес", category: "Осень", desc: "Горчичный, бордо, коричневый", colors: ["#ffdb58", "#800020", "#8b4513"], labels: ["Свитер", "Юбка", "Сапоги"], image: "https://avatars.mds.yandex.net/i?id=eaad11635595b34e9d888ea0b10b16aed4a02213-3374823-images-thumbs&n=13", pinterestQuery: "autumn fall mustard burgundy outfit" },
    { title: "Оливковая роща", category: "Осень", desc: "Оливковый с оранжевым", colors: ["#556b2f", "#ff8c00", "#d2b48c"], labels: ["Куртка", "Шарф", "Брюки"], image: "https://avatars.mds.yandex.net/get-shedevrum/12733905/8de064b9be7911ee9af47e2051c0c3c2/orig", pinterestQuery: "olive orange autumn outfit" },
    { title: "Терракотовый закат", category: "Осень", desc: "Тёплые тона", colors: ["#cc5801", "#d2b48c", "#2f4f2f"], labels: ["Пальто", "Свитер", "Брюки"], image: "https://avatars.mds.yandex.net/i?id=adac046b160ca4c5397494fe45a487f95d87f526-12475369-images-thumbs&n=13", pinterestQuery: "terracotta autumn fall outfit" },
    { title: "Ржавчина и песок", category: "Осень", desc: "Землистые оттенки", colors: ["#b7410e", "#d2b48c", "#556b2f"], labels: ["Платье", "Кардиган", "Сумка"], image: "https://i.pinimg.com/originals/27/f6/ac/27f6ac32aabae3b7870e45fe2ea4d6c2.jpg", pinterestQuery: "rust sand earth tone outfit" },
    { title: "Каштан и золото", category: "Осень", desc: "Богатая осень", colors: ["#8b4513", "#daa520", "#f5deb3"], labels: ["Пальто", "Шарф", "Перчатки"], image: "https://i.pinimg.com/736x/d0/a5/9d/d0a59daa172042526d9cb3b2fb05c1e1.jpg", pinterestQuery: "chestnut gold autumn outfit" },
    { title: "Бургунди и хаки", category: "Осень", desc: "Глубокая осень", colors: ["#800020", "#6b8e23", "#d2b48c"], labels: ["Юбка", "Свитер", "Ботинки"], image: "https://i.pinimg.com/736x/6d/e0/81/6de081b1e929366a7875fcbbb930c7a6.jpg", pinterestQuery: "burgundy khaki autumn outfit" },
    { title: "Зимняя ночь", category: "Зима", desc: "Синий, белый, серебро", colors: ["#1e3a5f", "#ffffff", "#c0c0c0"], labels: ["Пальто", "Свитер", "Аксессуары"], image: "https://i.pinimg.com/736x/31/c6/c0/31c6c03e975332969bfc2e3357ad9627.jpg", pinterestQuery: "winter navy white silver outfit" },
    { title: "Рождество", category: "Зима", desc: "Чёрный, красный, серый", colors: ["#000000", "#dc143c", "#808080"], labels: ["Платье", "Аксессуары", "Обувь"], image: "https://i.pinimg.com/474x/4b/a6/88/4ba6883b8f3c11733af62702ea04cf4d.jpg?nii=t", pinterestQuery: "christmas black red gray outfit" },
    { title: "Ледяная свежесть", category: "Зима", desc: "Холодные оттенки", colors: ["#4682b4", "#e8e8e8", "#2c3e50"], labels: ["Пуховик", "Шарф", "Брюки"], image: "https://i.pinimg.com/736x/9b/8c/a5/9b8ca56c71bc98ef73c7ffee8222ec55.jpg", pinterestQuery: "winter icy blue gray outfit" },
    { title: "Графит и снег", category: "Зима", desc: "Зимний минимализм", colors: ["#36454f", "#ffffff", "#708090"], labels: ["Пальто", "Свитер", "Шапка"], image: "https://i.pinimg.com/736x/b9/a6/df/b9a6df3aa110eb9364ab47d7648d798a.jpg", pinterestQuery: "graphite snow winter minimal outfit" },
    { title: "Тёмная зима", category: "Зима", desc: "Чёрный и бордо", colors: ["#000000", "#800020", "#c0c0c0"], labels: ["Куртка", "Шарф", "Перчатки"], image: "https://static.cdn.oskelly.ru/product/1751720/item-63d13e64-6b9d-4a6f-82c6-ae0434348aa6.jpg", pinterestQuery: "dark winter black burgundy outfit" },
    { title: "Северное сияние", category: "Зима", desc: "Фиолетовый и бирюза", colors: ["#800080", "#40e0d0", "#f0f0f0"], labels: ["Платье", "Жакет", "Сумка"], image: "https://i.pinimg.com/736x/31/1a/05/311a056183c3f7d8e143e131251c2086.jpg", pinterestQuery: "northern lights purple turquoise outfit" },
    { title: "Весенний сад", category: "Весна", desc: "Мята и коралл", colors: ["#98ff98", "#ff7f50", "#ffffff"], labels: ["Юбка", "Топ", "Кеды"], image: "https://i.pinimg.com/originals/cf/6a/77/cf6a77e04024abb4f133935468b28588.jpg", pinterestQuery: "spring mint coral outfit" },
    { title: "Цветущая лаванда", category: "Весна", desc: "Лаванда и жёлтый", colors: ["#e6e6fa", "#fff44f", "#a9a9a9"], labels: ["Платье", "Кардиган", "Сумка"], image: "https://i.pinimg.com/736x/ec/4b/d3/ec4bd303a40d9e293390fe91bb5281a9.jpg", pinterestQuery: "spring lavender yellow outfit" },
    { title: "Розовый пион", category: "Весна", desc: "Розовый с оливковым", colors: ["#d4a0a0", "#6b8e23", "#f5f5dc"], labels: ["Блузка", "Брюки", "Сумка"], image: "https://avatars.mds.yandex.net/i?id=9cc6fdc5142f480e6dda95e66e52a0120bdfbb63-5233003-images-thumbs&n=13", pinterestQuery: "spring pink olive outfit" },
    { title: "Сирень и крем", category: "Весна", desc: "Нежная весна", colors: ["#c8a2c8", "#f5f5dc", "#d4b896"], labels: ["Платье", "Жакет", "Туфли"], image: "https://shophelp.ru/uploads/images/topic/2017/08/25/164866de7c_1000.jpg", pinterestQuery: "spring lilac cream outfit" },
    { title: "Персиковый цвет", category: "Весна", desc: "Персик и мята", colors: ["#ffdab9", "#98ff98", "#ffffff"], labels: ["Юбка", "Топ", "Кардиган"], image: "https://ir.ozone.ru/s3/multimedia-1-k/c1000/9849697580.jpg", pinterestQuery: "spring peach mint outfit" },
    { title: "Голубой лён", category: "Весна", desc: "Свежая весна", colors: ["#87ceeb", "#f5f5dc", "#d4b896"], labels: ["Рубашка", "Брюки", "Ремень"], image: "https://i.pinimg.com/originals/b0/b0/7f/b0b07f93749c8fda348998d399995b00.jpg", pinterestQuery: "spring blue linen outfit" },
    { title: "Пляжный бриз", category: "Лето", desc: "Бирюза, белый, песок", colors: ["#40e0d0", "#ffffff", "#d2b48c"], labels: ["Шорты", "Майка", "Сандалии"], image: "https://i.pinimg.com/originals/ce/d9/be/ced9be80ae9c90ba9af642692758fcf7.png", pinterestQuery: "summer beach turquoise outfit" },
    { title: "Летний коктейль", category: "Лето", desc: "Розовый и голубой", colors: ["#ffb6c1", "#add8e6", "#f5f5dc"], labels: ["Платье", "Кардиган", "Сумка"], image: "https://i.pinimg.com/736x/ed/51/6d/ed516db5da6d8296bbfdc4ca459e0890.jpg", pinterestQuery: "summer pink blue outfit" },
    { title: "Цитрусовый взрыв", category: "Лето", desc: "Лайм и мандарин", colors: ["#32cd32", "#ff6347", "#fffacd"], labels: ["Футболка", "Шорты", "Кепка"], image: "https://i.pinimg.com/736x/95/7e/33/957e3386e44fd1056e562aa937bbb96e.jpg", pinterestQuery: "summer lime tangerine outfit" },
    { title: "Тропический закат", category: "Лето", desc: "Коралл и бирюза", colors: ["#ff7f50", "#40e0d0", "#ffffff"], labels: ["Платье", "Сумка", "Сандалии"], image: "https://i.pinimg.com/736x/e7/9d/4b/e79d4bad50d8e2fc64543910e48795c1.jpg", pinterestQuery: "tropical coral turquoise summer outfit" },
    { title: "Лимонад", category: "Лето", desc: "Жёлтый и белый", colors: ["#fff44f", "#ffffff", "#87ceeb"], labels: ["Платье", "Жакет", "Сумка"], image: "https://bel-linia.ru/image/cache/catalog/urs/19-129-1_48-52%281%29-655x1090.jpg", pinterestQuery: "summer yellow white lemonade outfit" },
    { title: "Морская волна", category: "Лето", desc: "Синий и коралл", colors: ["#0047ab", "#ff7f50", "#f0f0f0"], labels: ["Купальник", "Парео", "Шляпа"], image: "https://basket-22.wbbasket.ru/vol3721/part372183/372183976/images/big/1.webp", pinterestQuery: "summer ocean blue coral outfit" },
    { title: "Сафари", category: "Землистые", desc: "Оливковый, коричневый, крем", colors: ["#556b2f", "#8b4513", "#f5f5dc"], labels: ["Куртка", "Брюки", "Футболка"], image: "https://i.pinimg.com/originals/b7/2d/c9/b72dc9a019afba88f9afb4f136264108.jpg", pinterestQuery: "safari olive brown outfit" },
    { title: "Глиняный горшок", category: "Землистые", desc: "Терракота и песок", colors: ["#cc5801", "#d2b48c", "#2f4f2f"], labels: ["Платье", "Кардиган", "Сумка"], image: "https://avatars.mds.yandex.net/i?id=d7697140adf38d3c84f28970c0e5ca7624d456ffcbc751c8-5148463-images-thumbs&n=130", pinterestQuery: "terracotta sand earth tone outfit" },
    { title: "Кофе с молоком", category: "Землистые", desc: "Оттенки коричневого", colors: ["#3e2723", "#8d6e63", "#d7ccc8"], labels: ["Пальто", "Свитер", "Брюки"], image: "https://i.pinimg.com/originals/80/21/19/802119bfecad7d3254813becd3318137.png", pinterestQuery: "coffee brown neutral outfit" },
    { title: "Пустыня", category: "Землистые", desc: "Песок и охра", colors: ["#d2b48c", "#cc7722", "#8b7355"], labels: ["Платье", "Жакет", "Ремень"], image: "https://i.pinimg.com/videos/thumbnails/originals/85/fc/44/85fc4490afb98a58b91893633906dcf1.0000000.jpg", pinterestQuery: "desert sand ochre outfit" },
    { title: "Мох и камень", category: "Землистые", desc: "Зелёный и серый", colors: ["#6b8e23", "#808080", "#d2b48c"], labels: ["Куртка", "Брюки", "Ботинки"], image: "https://avatars.mds.yandex.net/i?id=618cd40029ca5480219cf8fff5556e29_sr-5174496-images-thumbs&n=13", pinterestQuery: "moss stone green gray outfit" },
    { title: "Шоколад и ваниль", category: "Землистые", desc: "Тёплый контраст", colors: ["#3e2723", "#f5f5dc", "#8b4513"], labels: ["Платье", "Кардиган", "Сумка"], image: "https://i.pinimg.com/originals/22/a7/61/22a7613c23c62219b3b1a8a2c177b393.jpg?nii=t", pinterestQuery: "chocolate vanilla brown outfit" }
];

const trendsData = [
    { title: "Коралловый закат", desc: "Тёплые тона для летних образов", colors: ["#ff6b6b", "#4ecdc4", "#ffe66d"], query: "coral sunset outfit fashion 2026" },
    { title: "Фиолетовая мечта", desc: "Градиенты и плавные переходы", colors: ["#667eea", "#764ba2", "#f093fb"], query: "purple gradient fashion outfit" },
    { title: "Природная свежесть", desc: "Экологичные и натуральные оттенки", colors: ["#11998e", "#38ef7d", "#fcfcfc"], query: "natural green eco fashion style" },
    { title: "Городской стиль", desc: "Смелые контрасты для мегаполиса", colors: ["#2c3e50", "#fd746c", "#ff9068"], query: "urban street style fashion outfit" },
    { title: "Минимализм", desc: "Чистота линий и монохромная база", colors: ["#f5f5f5", "#000000", "#9ca3af"], query: "minimalist monochrome fashion outfit" },
    { title: "Ретро 90-х", desc: "Кислотные и неоновые акценты", colors: ["#ff00ff", "#00ffff", "#ffff00"], query: "90s retro neon acid fashion" },
    { title: "Киберпанк", desc: "Футуристичные неоновые сочетания", colors: ["#a855f7", "#22c55e", "#1f2937"], query: "cyberpunk neon fashion outfit" },
    { title: "Скандинавский стиль", desc: "Уют, свет и натуральные текстуры", colors: ["#f8fafc", "#94a3b8", "#d4b896"], query: "scandinavian style fashion cozy" },
    { title: "Бохо-шик", desc: "Свобода, этника и природные мотивы", colors: ["#c19a6b", "#8b4513", "#f4e4c1"], query: "boho chic bohemian fashion outfit" },
    { title: "Тёмная романтика", desc: "Глубокие бархатные оттенки", colors: ["#4a0e0e", "#1a1a2e", "#800020"], query: "dark romantic gothic fashion outfit" },
    { title: "Пастельная мечта", desc: "Нежные и воздушные оттенки", colors: ["#ffd1dc", "#bae1ff", "#ffffba"], query: "pastel aesthetic soft fashion" },
    { title: "Офисный люкс", desc: "Элегантность делового стиля", colors: ["#2c3e50", "#bdc3c7", "#ecf0f1"], query: "luxury office business fashion" }
];

let currentUser = JSON.parse(localStorage.getItem('currentUser') || 'null');
let users = JSON.parse(localStorage.getItem('users') || '[]');
let favorites = JSON.parse(localStorage.getItem('colorFavorites') || '[]');
let currentGeneratedPalette = ['#6366f1', '#8b5cf6', '#ec4899'];
const categories = ["Все", ...new Set(palettes.map(p => p.category))];

function openPinterest(query) {
    const url = `https://www.pinterest.com/search/pins/?q=${query}`;
    window.open(url, '_blank', 'noopener,noreferrer');
    showToast('Открываем Pinterest...');
}

function renderTrends(containerId) {
    const container = document.getElementById(containerId);
    if (!container) return;
    container.innerHTML = trendsData.map(trend => `
        <div class="trend-item" onclick="openPinterest('${encodeURIComponent(trend.query)}')" title="Открыть в Pinterest: ${trend.title}">
            <div class="trend-colors">
                ${trend.colors.map(c => `<div class="trend-color" style="background: ${c}"></div>`).join('')}
            </div>
            <h3>${trend.title}</h3>
            <p>${trend.desc}</p>
        </div>
    `).join('');
}

function initAuth() {
    const container = document.getElementById('auth-container');
    if (currentUser) {
        const initial = currentUser.name.charAt(0).toUpperCase();
        container.innerHTML = `
            <div class="profile-btn" id="profileBtn">
                <div class="profile-avatar">${initial}</div>
                <span class="profile-name">${currentUser.name}</span>
                <div class="profile-dropdown" id="profileDropdown">
                    <div class="dropdown-item" onclick="navigateTo('profile')"><span class="dropdown-icon">👤</span><span>Мой профиль</span></div>
                    <div class="dropdown-item" onclick="navigateTo('favorites')"><span class="dropdown-icon">❤️</span><span>Избранное</span><span class="nav-fav-badge" style="margin-left: auto;">${favorites.length}</span></div>
                    <div class="dropdown-divider"></div>
                    <div class="dropdown-item danger" onclick="handleLogout()"><span class="dropdown-icon">🚪</span><span>Выйти</span></div>
                </div>
            </div>
        `;
        setTimeout(() => {
            const btn = document.getElementById('profileBtn');
            const dropdown = document.getElementById('profileDropdown');
            btn.addEventListener('click', (e) => { e.stopPropagation(); dropdown.classList.toggle('show'); });
        }, 0);
    } else {
        container.innerHTML = `<button class="auth-btn" onclick="openAuthModal()">Войти</button>`;
    }
}

function openAuthModal() {
    document.getElementById('authOverlay').classList.add('show');
    document.getElementById('authError').classList.remove('show');
    document.getElementById('authSuccess').classList.remove('show');
}

function closeAuthModal() {
    document.getElementById('authOverlay').classList.remove('show');
    document.getElementById('authError').classList.remove('show');
    document.getElementById('authSuccess').classList.remove('show');
}

function switchAuthTab(tab) {
    document.querySelectorAll('.auth-tab').forEach(t => t.classList.remove('active'));
    document.querySelectorAll('.auth-form').forEach(f => f.classList.remove('active'));
    if (tab === 'login') {
        document.querySelectorAll('.auth-tab')[0].classList.add('active');
        document.getElementById('loginForm').classList.add('active');
        document.getElementById('authTitle').textContent = 'Вход в аккаунт';
        document.getElementById('authSubtitle').textContent = 'Войдите, чтобы сохранять избранные палитры';
    } else {
        document.querySelectorAll('.auth-tab')[1].classList.add('active');
        document.getElementById('registerForm').classList.add('active');
        document.getElementById('authTitle').textContent = 'Создать аккаунт';
        document.getElementById('authSubtitle').textContent = 'Зарегистрируйтесь для доступа ко всем функциям';
    }
    document.getElementById('authError').classList.remove('show');
    document.getElementById('authSuccess').classList.remove('show');
}

function showAuthError(msg) {
    document.getElementById('authError').textContent = msg;
    document.getElementById('authError').classList.add('show');
}

function showAuthSuccess(msg) {
    document.getElementById('authSuccess').textContent = msg;
    document.getElementById('authSuccess').classList.add('show');
}

function handleRegister(e) {
    e.preventDefault();
    const name = document.getElementById('regName').value.trim();
    const email = document.getElementById('regEmail').value.trim().toLowerCase();
    const password = document.getElementById('regPassword').value;
    if (password.length < 6) { showAuthError('Пароль должен содержать минимум 6 символов'); return; }
    if (users.find(u => u.email === email)) { showAuthError('Пользователь с таким email уже существует'); return; }
    const newUser = { id: Date.now(), name, email, password, createdAt: new Date().toISOString() };
    users.push(newUser);
    localStorage.setItem('users', JSON.stringify(users));
    currentUser = { id: newUser.id, name: newUser.name, email: newUser.email };
    localStorage.setItem('currentUser', JSON.stringify(currentUser));
    showAuthSuccess('Аккаунт создан! Добро пожаловать, ' + name + '!');
    setTimeout(() => { closeAuthModal(); initAuth(); updateProfilePage(); showToast('Добро пожаловать, ' + name + '!'); }, 1000);
}

function handleLogin(e) {
    e.preventDefault();
    const email = document.getElementById('loginEmail').value.trim().toLowerCase();
    const password = document.getElementById('loginPassword').value;
    const user = users.find(u => u.email === email && u.password === password);
    if (!user) { showAuthError('Неверный email или пароль'); return; }
    currentUser = { id: user.id, name: user.name, email: user.email };
    localStorage.setItem('currentUser', JSON.stringify(currentUser));
    showAuthSuccess('Добро пожаловать, ' + user.name + '!');
    setTimeout(() => { closeAuthModal(); initAuth(); updateProfilePage(); showToast('С возвращением, ' + user.name + '!'); }, 1000);
}

function handleLogout() {
    currentUser = null;
    localStorage.removeItem('currentUser');
    document.getElementById('profileDropdown').classList.remove('show');
    initAuth();
    showToast('Вы вышли из аккаунта');
    const activePage = document.querySelector('.page.active');
    if (activePage && activePage.id === 'page-profile') navigateTo('home');
}

function updateProfilePage() {
    if (!currentUser) return;
    document.getElementById('profileName').textContent = currentUser.name;
    document.getElementById('profileEmail').textContent = currentUser.email;
    document.getElementById('profileAvatar').textContent = currentUser.name.charAt(0).toUpperCase();
    document.getElementById('profileInfoName').textContent = currentUser.name;
    document.getElementById('profileInfoEmail').textContent = currentUser.email;
    const user = users.find(u => u.id === currentUser.id);
    if (user) {
        const date = new Date(user.createdAt);
        document.getElementById('profileInfoDate').textContent = date.toLocaleDateString('ru-RU', { year: 'numeric', month: 'long', day: 'numeric' });
    }
    document.getElementById('profileFavCount').textContent = favorites.length;
}

document.addEventListener('click', () => {
    const dropdown = document.getElementById('profileDropdown');
    if (dropdown) dropdown.classList.remove('show');
});

function navigateTo(page) {
    document.querySelectorAll('.page').forEach(p => p.classList.remove('active'));
    document.getElementById(`page-${page}`).classList.add('active');
    document.querySelectorAll('.nav-links button').forEach(b => b.classList.remove('active'));
    const navBtn = document.getElementById(`nav-${page}`);
    if (navBtn) navBtn.classList.add('active');
    window.scrollTo(0, 0);
    if (page === 'favorites') renderFavorites();
    if (page === 'profile') updateProfilePage();
}

function generateSmartPalette() {
    const algorithm = document.getElementById('genAlgorithm').value;
    let colors = [];
    const baseHue = Math.floor(Math.random() * 360);
    switch(algorithm) {
        case 'complementary':
            colors = [hslToHex(baseHue, 70, 60), hslToHex((baseHue + 180) % 360, 70, 60), hslToHex(baseHue, 70, 40)]; break;
        case 'analogous':
            colors = [hslToHex(baseHue, 70, 60), hslToHex((baseHue + 30) % 360, 70, 60), hslToHex((baseHue + 60) % 360, 70, 60)]; break;
        case 'triadic':
            colors = [hslToHex(baseHue, 70, 60), hslToHex((baseHue + 120) % 360, 70, 60), hslToHex((baseHue + 240) % 360, 70, 60)]; break;
        case 'monochromatic':
            colors = [hslToHex(baseHue, 60, 75), hslToHex(baseHue, 60, 50), hslToHex(baseHue, 60, 30)]; break;
        case 'pastel':
            colors = [hslToHex(baseHue, 40, 85), hslToHex((baseHue + 40) % 360, 40, 85), hslToHex((baseHue + 80) % 360, 40, 85)]; break;
        default:
            for (let i = 0; i < 3; i++) colors.push(hslToHex(Math.floor(Math.random() * 360), Math.floor(Math.random() * 40) + 60, Math.floor(Math.random() * 40) + 40));
    }
    currentGeneratedPalette = colors;
    updateGeneratedPaletteUI();
    showToast('Палитра сгенерирована!');
}

function updateGeneratedPaletteUI() {
    const container = document.getElementById('generatedPalette');
    const roles = ['Основной (60%)', 'Дополнительный (30%)', 'Акцент (10%)'];
    container.innerHTML = currentGeneratedPalette.map((c, i) => `
        <div class="generated-color-large" style="background: ${c}" onclick="copyColor('${c}')">
            <div class="color-role">${roles[i]}</div><span>${c}</span>
        </div>
    `).join('');
}

function saveGeneratedPalette() {
    if (!currentUser) { openAuthModal(); showToast('Войдите, чтобы сохранять палитры'); return; }
    const algorithm = document.getElementById('genAlgorithm');
    const algoName = algorithm.options[algorithm.selectedIndex].text;
    const palette = { title: `Палитра: ${algoName}`, category: "Сгенерированные", desc: "Создана в умном генераторе", colors: currentGeneratedPalette, labels: ["Основной", "Дополнительный", "Акцент"], image: "https://images.unsplash.com/photo-1550684848-fac1c5b4e853?w=800&q=80" };
    if (favorites.some(f => f.colors.join(',') === currentGeneratedPalette.join(','))) { showToast('Эта палитра уже в избранном'); return; }
    favorites.push(palette);
    localStorage.setItem('colorFavorites', JSON.stringify(favorites));
    updateStats(); initAuth();
    showToast('Палитра сохранена в избранное!');
}

function copyAllGenerated() {
    navigator.clipboard.writeText(currentGeneratedPalette.join(', ')).then(() => showToast('Все цвета скопированы'));
}

function shareGenerated() {
    const text = `Моя цветовая палитра: ${currentGeneratedPalette.join(', ')}`;
    if (navigator.share) navigator.share({ title: 'ColorMatch Палитра', text: text }).catch(() => copyAllGenerated());
    else copyAllGenerated();
}

function findMatchingPalettes(hex, name) {
    navigateTo('home');
    const grid = document.getElementById('grid');
    grid.innerHTML = '';
    const matchingPalettes = palettes.filter(p => p.colors.some(c => c.toLowerCase() === hex.toLowerCase()));
    const resultEl = document.getElementById('colorMatchResult');
    document.getElementById('matchTitle').textContent = `Найдено: ${matchingPalettes.length} палитр с цветом ${name}`;
    document.getElementById('matchDesc').textContent = `HEX: ${hex.toUpperCase()}`;
    resultEl.classList.add('show');
    if (matchingPalettes.length === 0) {
        grid.innerHTML = '<div style="grid-column: 1/-1; text-align: center; padding: 60px; color: var(--text-secondary);"><h3 style="font-size: 24px; margin-bottom: 12px;">Ничего не найдено</h3><p>Попробуйте другой цвет</p></div>';
        return;
    }
    matchingPalettes.forEach((p, idx) => {
        const card = document.createElement('div');
        card.className = 'card';
        card.style.animationDelay = `${idx * 0.03}s`;
        const isFavorite = favorites.some(f => f.title === p.title);
        const chips = p.colors.map(c => `<div class="color-chip" onclick="copyColor('${c}')"><div class="color-circle" style="background:${c}"></div><span class="color-hex">${c}</span></div>`).join('');
        const outfitParts = p.colors.map((c, i) => `<div class="outfit-part" style="background:${c}; color:${isLight(c) ? '#333' : '#fff'}">${p.labels[i]}</div>`).join('');
        const outfitLabels = p.labels.map(l => `<div class="outfit-label">${l}</div>`).join('');
        card.innerHTML = `
            <div class="card-image"><img src="${p.image}" alt="${p.title}" onerror="this.src='https://images.unsplash.com/photo-1490481651871-ab68de25d43d?w=800&q=80'"><div class="card-category-badge">${p.category}</div></div>
            <div class="card-body">
                <div class="card-title">${p.title}</div><div class="card-desc">${p.desc}</div><div class="card-colors">${chips}</div>
                <div class="outfit-viz">${outfitParts}</div><div class="outfit-labels">${outfitLabels}</div>
                <div class="card-actions">
                    <button class="action-btn action-btn-primary" onclick="openPinterest('${encodeURIComponent(p.pinterestQuery)}')">📌 Pinterest</button>
                    <button class="action-btn action-btn-secondary" onclick="sharePalette('${p.title}')">Поделиться</button>
                    <button class="action-btn favorite ${isFavorite ? 'active' : ''}" onclick="toggleFavorite('${p.title}')" data-title="${p.title}">${isFavorite ? 'В избранном' : 'В избранное'}</button>
                </div>
            </div>`;
        grid.appendChild(card);
    });
    showToast(`Найдено ${matchingPalettes.length} палитр с цветом ${name}`);
}

function clearColorMatch() {
    document.getElementById('colorMatchResult').classList.remove('show');
    renderAllCards();
}

function renderAllCards() {
    const grid = document.getElementById('grid');
    grid.innerHTML = '';
    palettes.forEach((p, idx) => {
        const card = document.createElement('div');
        card.className = 'card';
        card.dataset.category = p.category;
        card.dataset.title = p.title;
        card.style.animationDelay = `${idx * 0.03}s`;
        const isFavorite = favorites.some(f => f.title === p.title);
        const chips = p.colors.map(c => `<div class="color-chip" onclick="copyColor('${c}')"><div class="color-circle" style="background:${c}"></div><span class="color-hex">${c}</span></div>`).join('');
        const outfitParts = p.colors.map((c, i) => `<div class="outfit-part" style="background:${c}; color:${isLight(c) ? '#333' : '#fff'}">${p.labels[i]}</div>`).join('');
        const outfitLabels = p.labels.map(l => `<div class="outfit-label">${l}</div>`).join('');
        card.innerHTML = `
            <div class="card-image"><img src="${p.image}" alt="${p.title}" onerror="this.src='https://images.unsplash.com/photo-1490481651871-ab68de25d43d?w=800&q=80'"><div class="card-category-badge">${p.category}</div></div>
            <div class="card-body">
                <div class="card-title">${p.title}</div><div class="card-desc">${p.desc}</div><div class="card-colors">${chips}</div>
                <div class="outfit-viz">${outfitParts}</div><div class="outfit-labels">${outfitLabels}</div>
                <div class="card-actions">
                    <button class="action-btn action-btn-primary" onclick="openPinterest('${encodeURIComponent(p.pinterestQuery)}')">📌 Pinterest</button>
                    <button class="action-btn action-btn-secondary" onclick="sharePalette('${p.title}')">Поделиться</button>
                    <button class="action-btn favorite ${isFavorite ? 'active' : ''}" onclick="toggleFavorite('${p.title}')" data-title="${p.title}">${isFavorite ? 'В избранном' : 'В избранное'}</button>
                </div>
            </div>`;
        grid.appendChild(card);
    });
}

const slider60 = document.getElementById('slider60');
const slider30 = document.getElementById('slider30');
const slider10 = document.getElementById('slider10');
const value60 = document.getElementById('value60');
const value30 = document.getElementById('value30');
const value10 = document.getElementById('value10');
const preview60 = document.getElementById('preview60');
const preview30 = document.getElementById('preview30');
const preview10 = document.getElementById('preview10');
const color60 = document.getElementById('color60');
const color30 = document.getElementById('color30');
const color10 = document.getElementById('color10');

function updateRule() {
    const v60 = parseInt(slider60.value), v30 = parseInt(slider30.value), v10 = parseInt(slider10.value);
    value60.textContent = v60 + '%'; value30.textContent = v30 + '%'; value10.textContent = v10 + '%';
    preview60.style.flex = v60; preview30.style.flex = v30; preview10.style.flex = v10;
    preview60.textContent = v60 + '%'; preview30.textContent = v30 + '%'; preview10.textContent = v10 + '%';
    preview60.style.background = color60.value; preview30.style.background = color30.value; preview10.style.background = color10.value;
}

slider60.addEventListener('input', updateRule);
slider30.addEventListener('input', updateRule);
slider10.addEventListener('input', updateRule);
color60.addEventListener('input', updateRule);
color30.addEventListener('input', updateRule);
color10.addEventListener('input', updateRule);

function setPreset(type) {
    const presets = {
        classic: { v60: 60, v30: 30, v10: 10, c60: '#1e3a5f', c30: '#87ceeb', c10: '#dc143c' },
        bold: { v60: 50, v30: 40, v10: 10, c60: '#000000', c30: '#ff0000', c10: '#ffffff' },
        soft: { v60: 70, v30: 25, v10: 5, c60: '#f5f5dc', c30: '#d4b896', c10: '#8b7355' },
        nature: { v60: 60, v30: 30, v10: 10, c60: '#556b2f', c30: '#8b4513', c10: '#d2b48c' }
    };
    const p = presets[type];
    slider60.value = p.v60; slider30.value = p.v30; slider10.value = p.v10;
    color60.value = p.c60; color30.value = p.c30; color10.value = p.c10;
    updateRule();
}

const sidebarCategoriesEl = document.getElementById('sidebar-categories');
categories.forEach((cat, i) => {
    const count = cat === 'Все' ? palettes.length : palettes.filter(p => p.category === cat).length;
    const item = document.createElement('div');
    item.className = 'sidebar-item' + (i === 0 ? ' active' : '');
    item.innerHTML = `<div class="sidebar-item-label">${cat}</div><div class="sidebar-item-desc">${count} палитр</div>`;
    item.onclick = () => {
        clearColorMatch();
        document.querySelectorAll('.sidebar-item').forEach(s => s.classList.remove('active'));
        item.classList.add('active');
        filterByCategory(cat);
    };
    sidebarCategoriesEl.appendChild(item);
});

function filterByCategory(category) {
    navigateTo('home');
    const btn = Array.from(document.querySelectorAll('.filter-btn')).find(b => b.textContent === category);
    if (btn) filterCards(category, btn);
    document.getElementById('searchInput').value = '';
}

function updateStats() {
    document.getElementById('total-palettes').textContent = palettes.length;
    document.getElementById('categories-count').textContent = categories.length - 1;
    document.getElementById('favorites-count-stat').textContent = favorites.length;
    document.getElementById('nav-fav-count').textContent = favorites.length;
}

const filtersEl = document.getElementById('filters');
categories.forEach((cat, i) => {
    const btn = document.createElement('button');
    btn.className = 'filter-btn' + (i === 0 ? ' active' : '');
    btn.textContent = cat;
    btn.onclick = () => {
        clearColorMatch();
        filterCards(cat, btn);
        document.querySelectorAll('.sidebar-item').forEach(s => s.classList.remove('active'));
        document.querySelectorAll('.sidebar-item')[i].classList.add('active');
        document.getElementById('searchInput').value = '';
    };
    filtersEl.appendChild(btn);
});

renderAllCards();
renderTrends('trendsGridHome');
renderTrends('trendsGridPage');
updateStats();
updateRule();
initAuth();

function filterCards(category, btn) {
    document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
    btn.classList.add('active');
    document.querySelectorAll('.card').forEach((card, i) => {
        const match = category === 'Все' || card.dataset.category === category;
        card.classList.toggle('hidden', !match);
        if (match) {
            card.style.animation = 'none';
            card.offsetHeight;
            card.style.animation = `cardIn 0.4s ease ${i * 0.03}s backwards`;
        }
    });
}

function resetFilters() {
    clearColorMatch();
    document.getElementById('searchInput').value = '';
    document.querySelectorAll('.filter-btn').forEach((b, i) => b.classList.toggle('active', i === 0));
    document.querySelectorAll('.sidebar-item').forEach((s, i) => s.classList.toggle('active', i === 0));
    document.querySelectorAll('.card').forEach(c => c.classList.remove('hidden'));
    showToast('Фильтры сброшены');
}

document.getElementById('searchInput').addEventListener('input', (e) => {
    clearColorMatch();
    const query = e.target.value.toLowerCase().trim();
    if (query.length > 0) {
        document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
        document.querySelectorAll('.sidebar-item').forEach(s => s.classList.remove('active'));
    } else {
        document.querySelector('.filter-btn').classList.add('active');
        document.querySelector('.sidebar-item').classList.add('active');
    }
    document.querySelectorAll('.card').forEach((card, i) => {
        const title = card.dataset.title.toLowerCase();
        const category = card.dataset.category.toLowerCase();
        const desc = card.querySelector('.card-desc').textContent.toLowerCase();
        const match = title.includes(query) || category.includes(query) || desc.includes(query);
        card.classList.toggle('hidden', !match);
        if (match) {
            card.style.animation = 'none';
            card.offsetHeight;
            card.style.animation = `cardIn 0.4s ease ${i * 0.03}s backwards`;
        }
    });
});

function copyColor(hex) {
    navigator.clipboard.writeText(hex).then(() => showToast(`Цвет ${hex} скопирован`)).catch(() => showToast(`Цвет: ${hex}`));
}

function copyAllColors(title) {
    const palette = palettes.find(p => p.title === title);
    if (palette) navigator.clipboard.writeText(`${palette.title}\n${palette.colors.join(', ')}`).then(() => showToast(`Все цвета "${title}" скопированы`));
}

function toggleFavorite(title) {
    if (!currentUser) { openAuthModal(); showToast('Войдите, чтобы добавлять в избранное'); return; }
    const idx = favorites.findIndex(f => f.title === title);
    const btn = document.querySelector(`.action-btn.favorite[data-title="${title}"]`);
    if (idx > -1) {
        favorites.splice(idx, 1);
        if (btn) { btn.classList.remove('active'); btn.textContent = 'В избранное'; }
        showToast('Удалено из избранного');
    } else {
        favorites.push(palettes.find(p => p.title === title));
        if (btn) { btn.classList.add('active'); btn.textContent = 'В избранном'; }
        showToast('Добавлено в избранное');
    }
    localStorage.setItem('colorFavorites', JSON.stringify(favorites));
    updateStats(); initAuth();
}

function renderFavorites() {
    const grid = document.getElementById('favorites-grid');
    if (favorites.length === 0) {
        grid.innerHTML = '<div style="grid-column: 1/-1; text-align: center; padding: 60px; color: white; font-size: 18px;">Избранное пусто. Добавьте палитры с главной страницы!</div>';
        return;
    }
    grid.innerHTML = '';
    favorites.forEach((p, idx) => {
        const card = document.createElement('div');
        card.className = 'card';
        card.style.animationDelay = `${idx * 0.03}s`;
        const chips = p.colors.map(c => `<div class="color-chip" onclick="copyColor('${c}')"><div class="color-circle" style="background:${c}"></div><span class="color-hex">${c}</span></div>`).join('');
        const query = p.pinterestQuery || `${p.title} ${p.category} fashion outfit`.toLowerCase();
        card.innerHTML = `
            <div class="card-image"><img src="${p.image}" alt="${p.title}"><div class="card-category-badge">${p.category}</div></div>
            <div class="card-body">
                <div class="card-title">${p.title}</div><div class="card-desc">${p.desc}</div><div class="card-colors">${chips}</div>
                <div class="card-actions">
                    <button class="action-btn action-btn-primary" onclick="openPinterest('${encodeURIComponent(query)}')">📌 Pinterest</button>
                    <button class="action-btn action-btn-secondary" onclick="removeFromFavorites('${p.title}')">Удалить</button>
                </div>
            </div>`;
        grid.appendChild(card);
    });
}

function removeFromFavorites(title) {
    const idx = favorites.findIndex(f => f.title === title);
    if (idx > -1) {
        favorites.splice(idx, 1);
        localStorage.setItem('colorFavorites', JSON.stringify(favorites));
        updateStats(); renderFavorites(); initAuth();
        showToast('Удалено из избранного');
    }
}

function sharePalette(title) {
    const palette = palettes.find(p => p.title === title);
    const text = `${palette.title} — ${palette.desc}\nЦвета: ${palette.colors.join(', ')}`;
    if (navigator.share) navigator.share({ title: palette.title, text: text, url: window.location.href }).catch(() => copyToClipboard(text));
    else copyToClipboard(text);
}

function copyToClipboard(text) {
    navigator.clipboard.writeText(text).then(() => showToast('Скопировано')).catch(() => {
        const textArea = document.createElement('textarea');
        textArea.value = text;
        document.body.appendChild(textArea);
        textArea.select();
        document.execCommand('copy');
        document.body.removeChild(textArea);
        showToast('Скопировано');
    });
}

function generateRandomPalette() {
    navigateTo('home');
    clearColorMatch();
    const random = palettes[Math.floor(Math.random() * palettes.length)];
    const card = document.querySelector(`[data-title="${random.title}"]`);
    if (card) {
        document.getElementById('searchInput').value = '';
        document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
        document.querySelector('.filter-btn').classList.add('active');
        document.querySelectorAll('.sidebar-item').forEach(s => s.classList.remove('active'));
        document.querySelector('.sidebar-item').classList.add('active');
        document.querySelectorAll('.card').forEach(c => c.classList.remove('hidden'));
        setTimeout(() => {
            card.scrollIntoView({ behavior: 'smooth', block: 'center' });
            card.style.animation = 'none';
            card.offsetHeight;
            card.style.animation = 'cardIn 0.5s ease';
        }, 100);
        showToast(`"${random.title}"`);
    }
}

function hslToHex(h, s, l) {
    l /= 100;
    const a = s * Math.min(l, 1 - l) / 100;
    const f = n => {
        const k = (n + h / 30) % 12;
        const color = l - a * Math.max(Math.min(k - 3, 9 - k, 1), -1);
        return Math.round(255 * color).toString(16).padStart(2, '0');
    };
    return `#${f(0)}${f(8)}${f(4)}`;
}

function toggleFaq(element) {
    const faqItem = element.parentElement;
    const isActive = faqItem.classList.contains('active');
    document.querySelectorAll('.faq-item').forEach(item => item.classList.remove('active'));
    if (!isActive) faqItem.classList.add('active');
}

function showToast(msg) {
    const toast = document.getElementById('toast');
    toast.textContent = msg;
    toast.classList.add('show');
    setTimeout(() => toast.classList.remove('show'), 2000);
}

function isLight(hex) {
    const c = hex.replace('#', '');
    const r = parseInt(c.substr(0, 2), 16);
    const g = parseInt(c.substr(2, 2), 16);
    const b = parseInt(c.substr(4, 2), 16);
    return (r * 299 + g * 587 + b * 114) / 1000 > 150;
}

document.getElementById('authOverlay').addEventListener('click', (e) => {
    if (e.target === document.getElementById('authOverlay')) closeAuthModal();
});.
