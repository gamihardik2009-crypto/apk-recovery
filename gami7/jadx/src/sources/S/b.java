package S;

import B.y;
import J.A0;
import J.W;
import T.p;
import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class b implements A0 {

    /* renamed from: h, reason: collision with root package name */
    public m f5541h;

    /* renamed from: i, reason: collision with root package name */
    public j f5542i;

    /* renamed from: j, reason: collision with root package name */
    public String f5543j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5544k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f5545l;

    /* renamed from: m, reason: collision with root package name */
    public K1.m f5546m;

    /* renamed from: n, reason: collision with root package name */
    public final y f5547n = new y(18, this);

    public b(m mVar, j jVar, String str, Object obj, Object[] objArr) {
        this.f5541h = mVar;
        this.f5542i = jVar;
        this.f5543j = str;
        this.f5544k = obj;
        this.f5545l = objArr;
    }

    @Override // J.A0
    public final void a() {
        K1.m mVar = this.f5546m;
        if (mVar != null) {
            mVar.s();
        }
    }

    @Override // J.A0
    public final void b() {
        d();
    }

    @Override // J.A0
    public final void c() {
        K1.m mVar = this.f5546m;
        if (mVar != null) {
            mVar.s();
        }
    }

    public final void d() {
        String K3;
        j jVar = this.f5542i;
        if (this.f5546m != null) {
            throw new IllegalArgumentException(("entry(" + this.f5546m + ") is not null").toString());
        }
        if (jVar != null) {
            y yVar = this.f5547n;
            Object c3 = yVar.c();
            if (c3 == null || jVar.c(c3)) {
                this.f5546m = jVar.f(this.f5543j, yVar);
                return;
            }
            if (c3 instanceof p) {
                p pVar = (p) c3;
                if (pVar.c() == W.f4106j || pVar.c() == W.f4109m || pVar.c() == W.f4107k) {
                    K3 = "MutableState containing " + pVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    K3 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                K3 = AbstractC0423a.K(c3);
            }
            throw new IllegalArgumentException(K3);
        }
    }
}
