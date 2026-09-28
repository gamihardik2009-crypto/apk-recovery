package n2;

import D.C0053w;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import m2.C0865g;
import m2.InterfaceC0861c;

/* renamed from: n2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0961m extends AbstractC0968t {
    public static boolean E(Iterable iterable, Object obj) {
        z2.h.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : I(iterable, obj) >= 0;
    }

    public static Object F(Collection collection) {
        z2.h.f(collection, "<this>");
        if (collection instanceof List) {
            return G((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object G(List list) {
        z2.h.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object H(List list) {
        z2.h.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int I(Iterable iterable, Object obj) {
        z2.h.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 < 0) {
                AbstractC0963o.y();
                throw null;
            }
            if (z2.h.a(obj, obj2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final void J(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, y2.c cVar) {
        z2.h.f(iterable, "<this>");
        z2.h.f(charSequence, "separator");
        z2.h.f(charSequence2, "prefix");
        z2.h.f(charSequence3, "postfix");
        z2.h.f(charSequence4, "truncated");
        sb.append(charSequence2);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            } else {
                C1.y.j(sb, obj, cVar);
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void K(Iterable iterable, StringBuilder sb, C0053w c0053w, int i2) {
        if ((i2 & 64) != 0) {
            c0053w = null;
        }
        J(iterable, sb, "\n", "", "", -1, "...", c0053w);
    }

    public static String L(Iterable iterable, String str, String str2, String str3, y2.c cVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i2 & 2) != 0 ? "" : str2;
        String str6 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            cVar = null;
        }
        z2.h.f(iterable, "<this>");
        z2.h.f(str4, "separator");
        z2.h.f(str5, "prefix");
        z2.h.f(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        J(iterable, sb, str4, str5, str6, -1, "...", cVar);
        String sb2 = sb.toString();
        z2.h.e(sb2, "toString(...)");
        return sb2;
    }

    public static Object M(List list) {
        z2.h.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0963o.u(list));
    }

    public static Object N(List list) {
        z2.h.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable O(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList P(List list, InterfaceC0861c interfaceC0861c) {
        z2.h.f(list, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC0964p.z(list, 10));
        boolean z3 = false;
        for (Object obj : list) {
            boolean z4 = true;
            if (!z3 && z2.h.a(obj, interfaceC0861c)) {
                z3 = true;
                z4 = false;
            }
            if (z4) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList Q(Collection collection, Object obj) {
        z2.h.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList R(Collection collection, List list) {
        z2.h.f(collection, "<this>");
        z2.h.f(list, "elements");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List S(AbstractList abstractList) {
        z2.h.f(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return X(abstractList);
        }
        List Z2 = Z(abstractList);
        Collections.reverse(Z2);
        return Z2;
    }

    public static List T(Iterable iterable, Comparator comparator) {
        z2.h.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List Z2 = Z(iterable);
            AbstractC0967s.A(Z2, comparator);
            return Z2;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return X(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        z2.h.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC0959k.n(array);
    }

    public static List U(int i2, List list) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        C0970v c0970v = C0970v.f9165h;
        if (i2 == 0) {
            return c0970v;
        }
        if (i2 >= list.size()) {
            return X(list);
        }
        if (i2 == 1) {
            return AbstractC0962n.l(F(list));
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : AbstractC0962n.l(arrayList.get(0)) : c0970v;
    }

    public static final void V(Iterable iterable, AbstractCollection abstractCollection) {
        z2.h.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] W(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static List X(Iterable iterable) {
        z2.h.f(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        C0970v c0970v = C0970v.f9165h;
        if (!z3) {
            List Z2 = Z(iterable);
            ArrayList arrayList = (ArrayList) Z2;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? Z2 : AbstractC0962n.l(arrayList.get(0)) : c0970v;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0970v;
        }
        if (size2 != 1) {
            return Y(collection);
        }
        return AbstractC0962n.l(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList Y(Collection collection) {
        z2.h.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List Z(Iterable iterable) {
        z2.h.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Y((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        V(iterable, arrayList);
        return arrayList;
    }

    public static Set a0(Iterable iterable) {
        z2.h.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        V(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set b0(Iterable iterable) {
        z2.h.f(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        C0972x c0972x = C0972x.f9167h;
        if (!z3) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            V(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return c0972x;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(linkedHashSet.iterator().next());
            z2.h.e(singleton, "singleton(...)");
            return singleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0972x;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC0946A.m(collection.size()));
            V(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        z2.h.e(singleton2, "singleton(...)");
        return singleton2;
    }

    public static ArrayList c0(Iterable iterable, Iterable iterable2) {
        z2.h.f(iterable, "<this>");
        z2.h.f(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC0964p.z(iterable, 10), AbstractC0964p.z(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C0865g(it.next(), it2.next()));
        }
        return arrayList;
    }
}
