package M1;

import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class g extends AbstractC0423a {
    @Override // a.AbstractC0423a
    public final boolean A(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f4782b != dVar) {
                    return false;
                }
                iVar.f4782b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0423a
    public final boolean B(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f4781a != obj) {
                    return false;
                }
                iVar.f4781a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0423a
    public final boolean C(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f4783c != hVar) {
                    return false;
                }
                iVar.f4783c = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0423a
    public final void V(h hVar, h hVar2) {
        hVar.f4776b = hVar2;
    }

    @Override // a.AbstractC0423a
    public final void W(h hVar, Thread thread) {
        hVar.f4775a = thread;
    }
}
