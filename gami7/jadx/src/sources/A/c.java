package A;

import C0.C0019b;
import C0.q;
import D0.D;
import K1.f;
import android.graphics.Matrix;
import android.graphics.Path;
import c0.C0591j;
import c0.InterfaceC0570J;
import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import z2.i;

/* loaded from: classes.dex */
public final class c extends i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f10k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i2, AbstractC1103Q abstractC1103Q, int i3) {
        super(1);
        this.f8i = 1;
        this.f9j = i2;
        this.f10k = abstractC1103Q;
        this.f11l = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f8i) {
            case 0:
                AbstractC1102P.d((AbstractC1102P) obj, (AbstractC1103Q) this.f10k, -this.f9j, -this.f11l);
                return C0880v.f8657a;
            case 1:
                AbstractC1102P.d((AbstractC1102P) obj, (AbstractC1103Q) this.f10k, B2.a.D((this.f9j - r0.f9834h) / 2.0f), B2.a.D((this.f11l - r0.f9835i) / 2.0f));
                return C0880v.f8657a;
            case 2:
                AbstractC1102P.h((AbstractC1102P) obj, (AbstractC1103Q) this.f10k, this.f9j, this.f11l);
                return C0880v.f8657a;
            case 3:
                AbstractC1102P.d((AbstractC1102P) obj, (AbstractC1103Q) this.f10k, this.f9j, this.f11l);
                return C0880v.f8657a;
            default:
                q qVar = (q) obj;
                C0019b c0019b = qVar.f533a;
                int b3 = qVar.b(this.f9j);
                int b4 = qVar.b(this.f11l);
                CharSequence charSequence = c0019b.f486e;
                if (b3 < 0 || b3 > b4 || b4 > charSequence.length()) {
                    throw new IllegalArgumentException(("start(" + b3 + ") or end(" + b4 + ") is out of range [0.." + charSequence.length() + "], or start > end!").toString());
                }
                Path path = new Path();
                D d3 = c0019b.f485d;
                d3.f949f.getSelectionPath(b3, b4, path);
                int i2 = d3.f951h;
                if (i2 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i2);
                }
                long e3 = f.e(0.0f, qVar.f538f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(b0.c.d(e3), b0.c.e(e3));
                path.transform(matrix);
                C0591j c0591j = (C0591j) ((InterfaceC0570J) this.f10k);
                c0591j.getClass();
                c0591j.f7260a.addPath(path, b0.c.d(0L), b0.c.e(0L));
                return C0880v.f8657a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i2, int i3, int i4) {
        super(1);
        this.f8i = i4;
        this.f10k = obj;
        this.f9j = i2;
        this.f11l = i3;
    }
}
