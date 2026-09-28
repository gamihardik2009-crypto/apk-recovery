package n2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: n2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0968t extends AbstractC0967s {
    public static void B(ArrayList arrayList, Iterable iterable) {
        z2.h.f(arrayList, "<this>");
        z2.h.f(iterable, "elements");
        if (iterable instanceof Collection) {
            arrayList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    public static Object C(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object D(AbstractList abstractList) {
        z2.h.f(abstractList, "<this>");
        if (abstractList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return abstractList.remove(AbstractC0963o.u(abstractList));
    }
}
