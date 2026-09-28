package G2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1254a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1255b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.c f1256c;

    public /* synthetic */ d(g gVar, y2.c cVar, int i2) {
        this.f1254a = i2;
        this.f1255b = gVar;
        this.f1256c = cVar;
    }

    @Override // G2.g
    public final Iterator iterator() {
        switch (this.f1254a) {
            case 0:
                return new c(this);
            case 1:
                return new c(this, (byte) 0);
            default:
                return new n(this);
        }
    }

    public d(g gVar) {
        this.f1254a = 0;
        m mVar = m.f1271i;
        this.f1255b = gVar;
        this.f1256c = mVar;
    }
}
