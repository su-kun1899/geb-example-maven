package yahoo

import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import spock.lang.Ignore
import yahoo.SearchPage
import yahoo.TopPage

/**
 * トップページから検索ページへ遷移するテスト
 *
 * Created by su-kun1899 on 2016/11/30.
 */
class TopToSearchSpec extends GebReportingSpec {
    def "トップページから検索ページに遷移する"() {
        when:
        println 'ｷﾀ━━━━(ﾟ∀ﾟ)━━━━!!'
        to TopPage

        and:
        //<input type="submit" id="srchbtn" class="srchbtn" value="検索">
        $('#srchbtn').click()

        then:
        at SearchPage
    }
}
