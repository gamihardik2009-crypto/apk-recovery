package n1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r implements Comparable {

    /* renamed from: h, reason: collision with root package name */
    public final s f9081h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f9082i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f9083j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9084k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9085l;

    public r(s sVar, Bundle bundle, boolean z3, int i2, boolean z4) {
        z2.h.f(sVar, "destination");
        this.f9081h = sVar;
        this.f9082i = bundle;
        this.f9083j = z3;
        this.f9084k = i2;
        this.f9085l = z4;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r rVar) {
        z2.h.f(rVar, "other");
        boolean z3 = rVar.f9083j;
        boolean z4 = this.f9083j;
        if (z4 && !z3) {
            return 1;
        }
        if (!z4 && z3) {
            return -1;
        }
        int i2 = this.f9084k - rVar.f9084k;
        if (i2 > 0) {
            return 1;
        }
        if (i2 < 0) {
            return -1;
        }
        Bundle bundle = rVar.f9082i;
        Bundle bundle2 = this.f9082i;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            z2.h.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z5 = rVar.f9085l;
        boolean z6 = this.f9085l;
        if (!z6 || z5) {
            return (z6 || !z5) ? 0 : -1;
        }
        return 1;
    }
}
