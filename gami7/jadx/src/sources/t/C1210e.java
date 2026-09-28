package t;

import java.util.List;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1210e {

    /* renamed from: a, reason: collision with root package name */
    public final C1228w f10233a;

    public float a(int i2) {
        Object obj;
        C1219n h2 = this.f10233a.h();
        if (h2.f10296j.isEmpty()) {
            return 0.0f;
        }
        List list = h2.f10296j;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (((C1220o) obj).f10303a == i2) {
                break;
            }
            i3++;
        }
        if (((C1220o) obj) != null) {
            return r6.f10315m;
        }
        int size2 = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            i4 += ((C1220o) list.get(i5)).f10316n;
        }
        return ((i2 - b()) * ((i4 / list.size()) + h2.f10302p)) - r0.f10346d.b();
    }

    public int b() {
        return this.f10233a.f10346d.a();
    }
}
