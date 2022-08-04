package com.phaseshifter.canora.ui.data;

import com.phaseshifter.canora.data.theme.AppTheme;
import com.phaseshifter.canora.ui.data.formatting.FilterOptions;
import com.phaseshifter.canora.ui.data.formatting.SortingOptions;
import com.phaseshifter.canora.ui.data.misc.SelectionIndicator;

import java.io.Serializable;

/**
 * The set of presenter state saved in the view.
 */
public class StateBundle implements Serializable {
    public AppTheme theme;
    public boolean devMode;
    public FilterOptions filterOptions;
    public SortingOptions sortingOptions;
    public SelectionIndicator indicator;
}
