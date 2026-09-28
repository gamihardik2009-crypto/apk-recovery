package n2;

import java.util.ArrayList;
import java.util.List;

/* renamed from: n2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0963o extends AbstractC0962n {
    public static ArrayList t(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0957i(objArr, true));
    }

    public static int u(List list) {
        z2.h.f(list, "<this>");
        return list.size() - 1;
    }

    public static List v(Object... objArr) {
        return objArr.length > 0 ? AbstractC0959k.n(objArr) : C0970v.f9165h;
    }

    public static ArrayList w(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0957i(objArr, true));
    }

    public static final void x(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException("fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i3 + ") is less than zero.");
        }
        if (i4 <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i2 + ").");
    }

    public static void y() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
