package C0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: C0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0025h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0024g f504a = new C0024g("", null, 6);

    public static final ArrayList a(List list, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less than or equal to end (" + i3 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            C0022e c0022e = (C0022e) obj;
            if (c(i2, i3, c0022e.f497b, c0022e.f498c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C0022e c0022e2 = (C0022e) arrayList.get(i5);
            arrayList2.add(new C0022e(Math.max(i2, c0022e2.f497b) - i2, Math.min(i3, c0022e2.f498c) - i2, c0022e2.f496a, c0022e2.f499d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List b(C0024g c0024g, int i2, int i3) {
        List list;
        if (i2 == i3 || (list = c0024g.f501b) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= c0024g.f500a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            C0022e c0022e = (C0022e) obj;
            if (c(i2, i3, c0022e.f497b, c0022e.f498c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C0022e c0022e2 = (C0022e) arrayList.get(i5);
            arrayList2.add(new C0022e(B1.C.C(c0022e2.f497b, i2, i3) - i2, B1.C.C(c0022e2.f498c, i2, i3) - i2, c0022e2.f496a));
        }
        return arrayList2;
    }

    public static final boolean c(int i2, int i3, int i4, int i5) {
        if (Math.max(i2, i4) < Math.min(i3, i5)) {
            return true;
        }
        if (i2 <= i4 && i5 <= i3) {
            if (i3 != i5) {
                return true;
            }
            if ((i4 == i5) == (i2 == i3)) {
                return true;
            }
        }
        if (i4 <= i2 && i3 <= i5) {
            if (i5 != i3) {
                return true;
            }
            if ((i2 == i3) == (i4 == i5)) {
                return true;
            }
        }
        return false;
    }
}
