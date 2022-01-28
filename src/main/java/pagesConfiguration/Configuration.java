package pagesConfiguration;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import pageObject.*;
import sections.AccessoriesShoesPage;
import sections.Footer;
import sections.chat.ChatPage;
import sections.chat.NotSeeingMyRewardsChatPage;
import sections.chat.RealRewardsChatPage;



public class Configuration extends AbstractModule {
    @Override
    protected void configure()
    {
        bind(AeriePage.class);
        bind(Footer.class);
        bind(AccessoriesShoesPage.class);
        bind(GiftCardsPage.class);
        bind(HomePage.class);
        bind(ProductPage.class).in(Scopes.SINGLETON);
        bind(AccessoriesShoesPage.class);
        bind(ChatPage.class);
        bind(NotSeeingMyRewardsChatPage.class);
        bind(RealRewardsChatPage.class);
        bind(FavoritesPage.class);
    }
}
