package S0;

import B1.C;

/* loaded from: classes.dex */
public final class e extends C {
    @Override // B1.C
    public final void h0(f fVar, f fVar2) {
        fVar.f5587b = fVar2;
    }

    @Override // B1.C
    public final void i0(f fVar, Thread thread) {
        fVar.f5586a = thread;
    }

    @Override // B1.C
    public final boolean r(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f5593b != cVar) {
                    return false;
                }
                gVar.f5593b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B1.C
    public final boolean s(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f5592a != obj) {
                    return false;
                }
                gVar.f5592a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B1.C
    public final boolean t(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f5594c != fVar) {
                    return false;
                }
                gVar.f5594c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
