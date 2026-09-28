package C;

import C0.C0024g;
import C0.G;
import C0.H;
import C0.K;
import c0.C0603v;
import java.util.List;
import m2.C0880v;
import t0.AbstractC1248f;

/* loaded from: classes.dex */
public final class g extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f371i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f372j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i2) {
        super(1);
        this.f371i = i2;
        this.f372j = iVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        H h2;
        switch (this.f371i) {
            case 0:
                List list = (List) obj;
                i iVar = this.f372j;
                H h3 = iVar.L0().f347n;
                if (h3 != null) {
                    G g3 = h3.f461a;
                    h2 = new H(new G(g3.f451a, K.e(iVar.f383v, C0603v.f7277g, 0L, null, null, null, 0L, null, 0, 0L, 16777214), g3.f453c, g3.f454d, g3.f455e, g3.f456f, g3.f457g, g3.f458h, g3.f459i, g3.f460j), h3.f462b, h3.f463c);
                    list.add(h2);
                } else {
                    h2 = null;
                }
                break;
            case 1:
                C0024g c0024g = (C0024g) obj;
                i iVar2 = this.f372j;
                f fVar = iVar2.f381I;
                if (fVar == null) {
                    f fVar2 = new f(iVar2.f382u, c0024g);
                    d dVar = new d(c0024g, iVar2.f383v, iVar2.f384w, iVar2.f386y, iVar2.f387z, iVar2.f375A, iVar2.f376B, iVar2.f377C);
                    dVar.c(iVar2.L0().f344k);
                    fVar2.f370d = dVar;
                    iVar2.f381I = fVar2;
                } else if (!z2.h.a(c0024g, fVar.f368b)) {
                    fVar.f368b = c0024g;
                    d dVar2 = fVar.f370d;
                    if (dVar2 != null) {
                        K k3 = iVar2.f383v;
                        H0.d dVar3 = iVar2.f384w;
                        int i2 = iVar2.f386y;
                        boolean z3 = iVar2.f387z;
                        int i3 = iVar2.f375A;
                        int i4 = iVar2.f376B;
                        List list2 = iVar2.f377C;
                        dVar2.f334a = c0024g;
                        dVar2.f335b = k3;
                        dVar2.f336c = dVar3;
                        dVar2.f337d = i2;
                        dVar2.f338e = z3;
                        dVar2.f339f = i3;
                        dVar2.f340g = i4;
                        dVar2.f341h = list2;
                        dVar2.f345l = null;
                        dVar2.f347n = null;
                        dVar2.f349p = -1;
                        dVar2.f348o = -1;
                        C0880v c0880v = C0880v.f8657a;
                    }
                }
                AbstractC1248f.p(iVar2);
                AbstractC1248f.o(iVar2);
                AbstractC1248f.n(iVar2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                i iVar3 = this.f372j;
                f fVar3 = iVar3.f381I;
                if (fVar3 != null) {
                    y2.c cVar = iVar3.E;
                    if (cVar != null) {
                        cVar.l(fVar3);
                    }
                    f fVar4 = iVar3.f381I;
                    if (fVar4 != null) {
                        fVar4.f369c = booleanValue;
                    }
                    AbstractC1248f.p(iVar3);
                    AbstractC1248f.o(iVar3);
                    AbstractC1248f.n(iVar3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
