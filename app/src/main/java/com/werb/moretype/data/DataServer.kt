package com.werb.moretype.data

import com.werb.moretype.MyApp
import com.werb.moretype.R
import com.werb.moretype.anim.AnimType
import com.werb.moretype.click.ItemClick
import com.werb.moretype.main.MainCard
import com.werb.moretype.multi.Message
import com.werb.moretype.single.SingleImage
import com.werb.moretype.single.SingleText

/**
 * Created by wanbo on 2017/7/14.
 */
object DataServer {

    fun getMainCardData(): List<MainCard>{
        val mainCardList = arrayListOf<MainCard>()
        mainCardList.add(MainCard("Single Register", "Register one2one ViewType"))
        mainCardList.add(MainCard("Multi Register", "Register one2more ViewType"))
        mainCardList.add(MainCard("Animation", "Provides five types of Animation"))
        mainCardList.add(MainCard("ItemClick", "Support onItemClick and onItemLongClick"))
        mainCardList.add(MainCard("Complete Example", "A combination of elegant implementation layouts"))
        mainCardList.add(MainCard("About Me", "Developer & Designer"))
        return mainCardList
    }

    fun getSingleRegisterData() : List<Any> {
        val singleRegisterList = arrayListOf<Any>()
        singleRegisterList.add(MainCard("Single Register", "Register one2one ViewType"))
        singleRegisterList.add(SingleText(MyApp.myApp.getString(R.string.app_name),MyApp.myApp.getString(R.string.app_desc), "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleText(MyApp.myApp.getString(R.string.app_name),MyApp.myApp.getString(R.string.app_desc), "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleText(MyApp.myApp.getString(R.string.app_name),MyApp.myApp.getString(R.string.app_desc), "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleText(MyApp.myApp.getString(R.string.app_name),MyApp.myApp.getString(R.string.app_desc), "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleText(MyApp.myApp.getString(R.string.app_name),MyApp.myApp.getString(R.string.app_desc), "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleText(MyApp.myApp.getString(R.string.app_name),MyApp.myApp.getString(R.string.app_desc), "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        singleRegisterList.add(SingleImage(MyApp.myApp.getString(R.string.app_name), "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9"))
        return singleRegisterList
    }

    fun getMultiRegisterData() : List<Any> {
        val multiRegisterList = arrayListOf<Any>()
        multiRegisterList.add(MainCard("Multi Register", "Register one2more ViewType"))
        multiRegisterList.add(Message(
                "https://avatars5.githubusercontent.com/u/12763277?v=4&s=460",
                "text",
                false,
                "Hello, i am wanbo",
                "",
                "1500048339",
                "",
                "",
                true
        ))
        multiRegisterList.add(Message(
                "",
                "text",
                true,
                "Hello, this is MoreType, new method to build data in RecyclerView with Kotlin!",
                "",
                "1500048446",
                "",
                "",
                false
        ))
        multiRegisterList.add(Message(
                "https://avatars5.githubusercontent.com/u/12763277?v=4&s=460",
                "image",
                false,
                "",
                "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9",
                "1500049048",
                "467",
                "292",
                true
        ))
        multiRegisterList.add(Message(
                "",
                "text",
                true,
                "Wow, so cool, i like it",
                "",
                "1500049067",
                "",
                "",
                false
        ))
        multiRegisterList.add(Message(
                "",
                "image",
                true,
                "",
                "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782",
                "1500049067",
                "3794",
                "2133",
                false
        ))
        return multiRegisterList
    }

    fun getAnimData(): List<Any> {
        val animDataList = arrayListOf<Any>()
        animDataList.add(MainCard("Animation", "Provides five types of Animation"))
        animDataList.add(AnimType("看图：这里是过去24小时发生的重要的事", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170715103111KHrZm3894Ys7uGIB.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("盗版碟商贩，本周的时代预言家 | 好奇心辞典", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714180204gKehPAICiFdx1Uwm.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("这部纪录片美极了，而且居然没有用到特效", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170712164259UN4sqz2rogl0bWKY.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("诺兰表示，《敦刻尔克》的叙事结构可能是他所有作品中最复杂的。？", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714133142RYHh7qjSKcUPa9wp.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("看图：这里是过去24小时发生的重要的事", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170715103111KHrZm3894Ys7uGIB.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("盗版碟商贩，本周的时代预言家 | 好奇心辞典", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714180204gKehPAICiFdx1Uwm.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("这部纪录片美极了，而且居然没有用到特效", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170712164259UN4sqz2rogl0bWKY.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("诺兰表示，《敦刻尔克》的叙事结构可能是他所有作品中最复杂的。？", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714133142RYHh7qjSKcUPa9wp.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("看图：这里是过去24小时发生的重要的事", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170715103111KHrZm3894Ys7uGIB.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("盗版碟商贩，本周的时代预言家 | 好奇心辞典", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714180204gKehPAICiFdx1Uwm.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("这部纪录片美极了，而且居然没有用到特效", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170712164259UN4sqz2rogl0bWKY.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("诺兰表示，《敦刻尔克》的叙事结构可能是他所有作品中最复杂的。？", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714133142RYHh7qjSKcUPa9wp.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("看图：这里是过去24小时发生的重要的事", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170715103111KHrZm3894Ys7uGIB.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("盗版碟商贩，本周的时代预言家 | 好奇心辞典", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714180204gKehPAICiFdx1Uwm.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("这部纪录片美极了，而且居然没有用到特效", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170712164259UN4sqz2rogl0bWKY.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("诺兰表示，《敦刻尔克》的叙事结构可能是他所有作品中最复杂的。？", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714133142RYHh7qjSKcUPa9wp.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("看图：这里是过去24小时发生的重要的事", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170715103111KHrZm3894Ys7uGIB.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("盗版碟商贩，本周的时代预言家 | 好奇心辞典", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714180204gKehPAICiFdx1Uwm.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("这部纪录片美极了，而且居然没有用到特效", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170712164259UN4sqz2rogl0bWKY.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("诺兰表示，《敦刻尔克》的叙事结构可能是他所有作品中最复杂的。？", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714133142RYHh7qjSKcUPa9wp.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("看图：这里是过去24小时发生的重要的事", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170715103111KHrZm3894Ys7uGIB.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("盗版碟商贩，本周的时代预言家 | 好奇心辞典", "城市", "http://img.qdaily.com/category/icon_yellow_app/20160606004533uFozK3xI4CHZjfSM.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714180204gKehPAICiFdx1Uwm.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("这部纪录片美极了，而且居然没有用到特效", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170712164259UN4sqz2rogl0bWKY.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        animDataList.add(AnimType("诺兰表示，《敦刻尔克》的叙事结构可能是他所有作品中最复杂的。？", "娱乐", "http://img.qdaily.com/category/icon_yellow_app/20160606004531TgJK5XPy61qfS7rN.png?imageMogr2/auto-orient/thumbnail/!160x160r/gravity/Center/crop/160x160/quality/85/ignore-error/1",
                "http://img.qdaily.com/article/article_show/20170714133142RYHh7qjSKcUPa9wp.jpg?imageMogr2/auto-orient/thumbnail/!640x380r/gravity/Center/crop/640x380/quality/85/format/jpg/ignore-error/1"))
        return animDataList
    }

    fun getItemClickData(): List<Any> {
        val itemClickDataList = arrayListOf<Any>()
        itemClickDataList.add(MainCard("ItemClick", "Support onItemClick and onItemLongClick"))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782", true))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9", false))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782", true))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9", false))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782", true))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9", false))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782", true))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9", false))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782", true))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9", false))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782", true))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9", false))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782", true))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9", false))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://boygeniusreport.files.wordpress.com/2014/12/ultimate-material-lollipop-collection-268.png?w=782", true))
        itemClickDataList.add(ItemClick("MoreType ItemClick", "https://img.scoop.it/f9ZSLthhGIc6nSw9gF7Z1Tl72eJkfbmt4t8yenImKBVvK0kTmF0xjctABnaLJIm9", false))
        return itemClickDataList
    }

}