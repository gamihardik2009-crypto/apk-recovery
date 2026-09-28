package H2;

import A0.n;
import C1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.AbstractC0961m;
import n2.AbstractC0963o;
import n2.AbstractC0964p;

/* loaded from: classes.dex */
public abstract class f extends y {
    public static String N(String str) {
        Comparable comparable;
        String str2;
        z2.h.f(str, "<this>");
        int i2 = 0;
        List k02 = G2.i.k0(new G2.d(l.X(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new n(8, str), 2));
        ArrayList arrayList = new ArrayList();
        for (Object obj : k02) {
            if (!l.V((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0964p.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            int length = str3.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!B2.a.w(str3.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i3));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        k02.size();
        int u3 = AbstractC0963o.u(k02);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : k02) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                AbstractC0963o.y();
                throw null;
            }
            String str4 = (String) obj2;
            if ((i2 == 0 || i2 == u3) && l.V(str4)) {
                str2 = null;
            } else {
                z2.h.f(str4, "<this>");
                if (intValue < 0) {
                    throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
                z2.h.e(str2, "substring(...)");
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i2 = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        AbstractC0961m.K(arrayList3, sb, null, 124);
        String sb2 = sb.toString();
        z2.h.e(sb2, "toString(...)");
        return sb2;
    }
}
