package com.example.project4.data

import com.example.project4.R
import com.example.project4.model.Category
import com.example.project4.model.Place

object MyCityData {

    fun getData(): List<Category>{
        return myCity
    }

    fun getPlaces(): List<Place> {
        val allPlaces: List<Place> = getData().flatMap { category -> category.recommendedPlaces }
        return allPlaces
    }

    val myCity = listOf(
        Category(
            id = 1,
            categoryName = "Nhà hàng",
            imageCate = R.drawable.fast_food,
            recommendedPlaces = listOf(
                Place(
                    id = 1,
                    idCategory = 1,
                    name = "Citron Restaurant",
                    imageUrl = "https://ik.imagekit.io/tvlk/blog/2023/04/nha-hang-o-da-nang-3.jpg?tr=dpr-2,w-675",
                    description = "Nhà hàng sở hữu nét kiến trúc đặc biệt do nằm trên sườn đồi cao, giữa núi rừng hùng vĩ của bán đảo Sơn Trà. Không gian phía trong được lấy cảm hứng từ trái chanh với hai gam màu nổi bật là xanh và vàng, tạo nên cảm giác tươi mới. Ngoài ra, nhà hàng còn sử dụng kết hợp nét thiết kế truyền thống và hiện đại, khiến không gian trở nên cuốn hút hơn. Các họa tiết cổ của người Việt cùng một số vật dụng như ngọn đèn, song cửa gỗ và chiếc ghế mô phỏng ngai vàng của vua chúa Nguyễn cũng là một dấu ấn đặc biệt của nhà hàng Citron Đà Nẵng."
                ),
                Place(
                    id = 2,
                    idCategory = 1,
                    name = "Memory Lounge",
                    imageUrl = "https://ik.imagekit.io/tvlk/blog/2023/04/nha-hang-o-da-nang-5.jpg?tr=dpr-2,w-675",
                    description = "Với sức chứa lên đến 350 người, Memory Lounge có cả khu vực nhà hàng, quầy bar và 3 phòng VIP sang trọng dùng để tổ chức những buổi yến tiệc xa hoa. Sau khi ăn xong, du khách cũng có thể đến tầng trệt để thưởng thức cà phê và ngắm nhìn vẻ đẹp của Đà Thành về đêm."
                ),
            )
        ),
        Category(
            id = 2,
            categoryName = "Công viên",
            imageCate = R.drawable.confetti,
            recommendedPlaces = listOf(
                Place(
                    id = 3,
                    idCategory = 2,
                    name = "Công viên nước ở Đà Nẵng",
                    imageUrl = "https://statics.vinpearl.com/cong-vien-o-da-nang-2_1679154780.jpg",
                    description = "Công viên nước Mikazuki Water Park 365 là công viên ở Đà Nẵng nổi tiếng, được xây dựng theo kiến trúc Nhật Bản và cách trung tâm thành phố Đà Nẵng 10km. Công viên có hệ thống nước nóng trong nhà lớn nhất miền Trung cùng công viên nước ngoài trời và dòng sông lười dài nhất Đà Nẵng. Đến đây, du khách sẽ tham gia tắm mát trong các bể bơi, bể tạo sóng, đường trượt rồng, trải nghiệm tắm Onsen, xông hơi sauna đá muối,... và chụp hình cùng mô hình núi Phú Sĩ cao 20m."
                ),
                Place(
                    id = 4,
                    name = "Công viên Biển Đông",
                    idCategory = 2,
                    imageUrl = "https://statics.vinpearl.com/cong-vien-o-da-nang-3_1635262437.jpg",
                    description = "Công viên Biển Đông là nơi thường diễn ra các hoạt động đại nhạc hội, sự kiện hoành tráng ở Đà Nẵng. Công viên ở Đà Nẵng này là nơi lý tưởng để bạn dạo mát, hít thở không khí trong lành, ngắm bình minh và tận hưởng làn gió mát rượi từ biển Phạm Văn Đồng. Không chỉ thế, du khách còn có thể cho đàn bồ câu ăn và vui đùa cùng chúng."
                )
            )
        ),

        Category(
            id = 3,
            categoryName = "Rạp chiếu phim",
            imageCate = R.drawable.watching_movie,
            recommendedPlaces = listOf(
                Place(
                    id = 5,
                    idCategory = 3,
                    name = "Starlight Đà Nẵng",
                    imageUrl = "https://toplist.vn/images/800px/starlight-nguyen-kim-da-nang-714351.jpg",
                    description = "Rạp Starlight Đà Nẵng nằm ở TT Nguyễn Kim - Điện Biên Phủ, Đà Nẵng, được xây dựng với tiêu chuẩn rạp Hollywood, chuẩn âm thanh Dolby 7.1, màn hình lớn, sắc nét. Starlight Đà Nẵng là 1 trong các rạp chiếu phim rất nhộn nhịp ở thành phố đáng sống nhất Việt Nam hiện nay. Thuộc chuỗi giải trí Starlight, khán giả đến đây sẽ có nhiều lựa chọn giải trí trước và sau khi chiếu phim. "
                ),
                Place(
                    id = 6,
                    idCategory = 3,
                    name = "Lotte Đà Nẵng",
                    imageUrl = "https://supermarket-media.com/wp-content/uploads/2021/09/quang-cao-tai-lotte-mart-da-nang-2.jpg",
                    description = "rạp Lotte toàn quốc đầy đủ & tiện lợi nhất. Rạp Lotte Đà Nẵng nằm ở tầng 5 Lotte Mart Đà Nẵng, với 4 phòng chiếu phim (479 chỗ ngồi) hiện đại, chất lượng âm thanh đỉnh cao. Lotte Đà Nẵng luôn không ngừng nâng cấp để mang đến những giây phú giải trí thoải mái nhất."
                )
            )
        ),
        Category(
            id = 4,
            categoryName = "Di tích lịch sử",
            imageCate = R.drawable.archaeology,
            recommendedPlaces = listOf(
                Place(
                    id = 7,
                    idCategory = 4,
                    name = "Di tích đình Đại Nam",
                    imageUrl = "https://statics.vinpearl.com/dinh-dai-nam-2_1640080173.jpg",
                    description = "Địa chỉ: Phố Nam Sơn, Phường Hòa Cường, Quận Hải Châu, thành phố Đà Nẵng\n\n" +
                            "Định Đại Nam được xây dựng vào năm Ất Tỵ (Năm 1905) và đây là nơi thờ Thành Hoàng Bảo An chính trực, Bổn Xứ Thổ Thần và các vị tiền nhân của làng. Đây là một ngôi đình có kiến trúc độc đáo in đậm dấu ấn văn hóa lịch sử thời nhà Nguyễn. Đình Đại Nam là ngôi đình nổi tiếng với các họa tiết độc đáo và hoa văn tinh xảo. Mỗi khi rằm tháng 2 âm lịch và vào các ngày lễ cuối năm như 30 tết, đình làng lại đón rất nhiều du khách thập phương từ khắp nơi đến làm lễ cầu an tại ngôi đình này."
                ),
                Place(
                    id = 8,
                    idCategory = 4,
                    name = "Di tích Đình cổ Hải Châu",
                    imageUrl = "https://baodaklak.vn/file/fb9e3a03798789de0179a1704dea238e/fb9e3a03798789de017a32af1c5137dd/122021/5_2_20211226150759.jpg",
                    description = "Địa điểm: Kiệt 42, tổ 6, đường Phan Chu Trinh. P. Hải Châu 1, q. Hải Châu, thành phố Đà Nẵng\n\n" +
                            "Nói đến các di tích lịch sử ở đà nẵng mà thiếu đình cổ Hải Châu thì thật thất vọng, ngôi đình này luôn là một trong những địa điểm tham quan hấp dẫn rất nhiều du khách. Í tai biết rằng, ngôi đình này xa xưa vốn là một ngôi chùa tên Phúc Hải. Điển tích kể rằng, chúa Nguyễn Phúc Chu năm Kỷ Hợi (1719) trong chuyến đi vào Quảng Nam đã nghỉ chân tại đây. Di tích lịch sử này bao gồm quần thể kiến trúc chính là Đình Hải Châu, nhà thờ Tiền Hiền, nhà thờ Chu phái và miếu Bà."
                )
            )
        )
    )
}