package org.ykarim.libtopuscore.model.item;

import org.joda.time.DateTime;

public interface Borrowable {

    void setCheckoutDate(DateTime checkoutDate);

    void setDueDate(DateTime dueDate);
}
