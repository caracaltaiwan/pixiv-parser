package filter;

import bean.IllustListItem;

/**
 * @author XieEnlong
 * @date 2015/8/11.
 */
public interface IllustFilter {

    boolean doFilter(IllustListItem item);
}