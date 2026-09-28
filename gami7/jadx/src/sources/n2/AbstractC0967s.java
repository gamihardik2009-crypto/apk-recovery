package n2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: n2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0967s extends AbstractC0966r {
    public static void A(List list, Comparator comparator) {
        z2.h.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
