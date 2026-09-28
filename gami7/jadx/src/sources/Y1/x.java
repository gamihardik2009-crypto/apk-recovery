package Y1;

import java.util.Comparator;
import java.util.List;
import n2.AbstractC0960l;

/* loaded from: classes.dex */
public final class x implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2;
        int i3 = 0;
        try {
            List d02 = H2.l.d0(H2.l.f0((String) obj, "Week "), new String[]{"/"});
            i2 = (Integer.parseInt((String) d02.get(1)) * 100) + Integer.parseInt((String) d02.get(0));
        } catch (Exception unused) {
            i2 = 0;
        }
        Integer valueOf = Integer.valueOf(i2);
        try {
            List d03 = H2.l.d0(H2.l.f0((String) obj2, "Week "), new String[]{"/"});
            i3 = (Integer.parseInt((String) d03.get(1)) * 100) + Integer.parseInt((String) d03.get(0));
        } catch (Exception unused2) {
        }
        return AbstractC0960l.g(valueOf, Integer.valueOf(i3));
    }
}
