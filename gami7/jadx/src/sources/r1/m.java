package r1;

import java.util.Collections;
import java.util.Set;
import n2.AbstractC0948C;
import n2.C0972x;
import o2.C1002h;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final K1.e f9950a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9951b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f9952c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f9953d;

    public m(K1.e eVar, int[] iArr, String[] strArr) {
        Set set;
        z2.h.f(eVar, "observer");
        this.f9950a = eVar;
        this.f9951b = iArr;
        this.f9952c = strArr;
        if (!(strArr.length == 0)) {
            set = Collections.singleton(strArr[0]);
            z2.h.e(set, "singleton(...)");
        } else {
            set = C0972x.f9167h;
        }
        this.f9953d = set;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void a(Set set) {
        z2.h.f(set, "invalidatedTablesIds");
        int[] iArr = this.f9951b;
        int length = iArr.length;
        Set set2 = C0972x.f9167h;
        if (length != 0) {
            int i2 = 0;
            if (length != 1) {
                C1002h c1002h = new C1002h();
                int length2 = iArr.length;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = i3 + 1;
                    if (set.contains(Integer.valueOf(iArr[i2]))) {
                        c1002h.add(this.f9952c[i3]);
                    }
                    i2++;
                    i3 = i4;
                }
                set2 = AbstractC0948C.f(c1002h);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                set2 = this.f9953d;
            }
        }
        if (!set2.isEmpty()) {
            this.f9950a.f(set2);
        }
    }
}
