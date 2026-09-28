package n2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: n2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0959k extends AbstractC0960l {
    public static List A(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0957i(objArr, false)) : AbstractC0962n.l(objArr[0]) : C0970v.f9165h;
    }

    public static List n(Object[] objArr) {
        z2.h.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        z2.h.e(asList, "asList(...)");
        return asList;
    }

    public static void o(char[] cArr, char[] cArr2, int i2, int i3, int i4) {
        z2.h.f(cArr, "<this>");
        z2.h.f(cArr2, "destination");
        System.arraycopy(cArr, i3, cArr2, i2, i4 - i3);
    }

    public static void p(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        z2.h.f(iArr, "<this>");
        z2.h.f(iArr2, "destination");
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    public static void q(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        z2.h.f(objArr, "<this>");
        z2.h.f(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static /* synthetic */ void r(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        p(iArr, iArr2, i2, 0, i3);
    }

    public static /* synthetic */ void s(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        q(objArr, objArr2, 0, i2, i3);
    }

    public static Object[] t(Object[] objArr, int i2, int i3) {
        z2.h.f(objArr, "<this>");
        int length = objArr.length;
        if (i3 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
            z2.h.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + length + ").");
    }

    public static void u(Object[] objArr, O2.v vVar, int i2, int i3) {
        z2.h.f(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, vVar);
    }

    public static void v(long[] jArr) {
        int length = jArr.length;
        z2.h.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static E2.d w(int[] iArr) {
        return new E2.d(0, iArr.length - 1, 1);
    }

    public static int x(Object[] objArr, Object obj) {
        z2.h.f(objArr, "<this>");
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (z2.h.a(obj, objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static String y(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ", ");
            }
            C1.y.j(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        z2.h.e(sb2, "toString(...)");
        return sb2;
    }

    public static char z(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}
