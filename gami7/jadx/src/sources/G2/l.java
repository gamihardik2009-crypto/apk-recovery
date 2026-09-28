package G2;

import j.C0744J;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements Iterable, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1269h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1270i;

    public /* synthetic */ l(int i2, Object obj) {
        this.f1269h = i2;
        this.f1270i = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1269h) {
            case 0:
                return ((g) this.f1270i).iterator();
            case 1:
                return new U2.h((U2.f) this.f1270i, 1);
            default:
                return new C0744J((Iterator) ((y2.a) this.f1270i).c());
        }
    }
}
