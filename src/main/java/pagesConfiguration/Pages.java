package pagesConfiguration;

import com.google.inject.Inject;
import pageObject.*;
import sections.AccessoriesShoesPage;
import sections.Footer;
import sections.chat.ChatPage;
import sections.chat.NotSeeingMyRewardsChatPage;
import sections.chat.RealRewardsChatPage;

public class Pages {
    @Inject
    public Footer footer;

    @Inject
    public AeriePage aeriePage;

    @Inject
    public GiftCardsPage giftCardsPage;

    @Inject
    public HomePage homePage;

    @Inject
    public ProductPage productPage;

    @Inject
    public AccessoriesShoesPage accessoriesShoesPage;

    @Inject
    public ChatPage chatPage;

    @Inject
    public NotSeeingMyRewardsChatPage notSeeingMyRewardsChatPage;

    @Inject
    public RealRewardsChatPage realRewardsChatPage;

    @Inject
    public FavoritesPage favoritesPage;
}
