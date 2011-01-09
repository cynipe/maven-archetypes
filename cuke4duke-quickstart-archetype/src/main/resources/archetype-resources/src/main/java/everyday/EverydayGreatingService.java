#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.everyday;

import ${package}.GreetingService;
import ${package}.PersonKind;

public class EverydayGreatingService implements GreetingService {

    @Override
    public String greetingFor(PersonKind kind) {
        switch (kind) {
            case FRIEND:
                return "おいすー！";
            case ACQUAINTANCE:
                return "どうも。";
            case STRANGER:
                return "え、誰？";
            default:
                throw new AssertionError();
        }
    }

}
