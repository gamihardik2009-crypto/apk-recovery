package z;

import C0.C0024g;
import I0.C0244a;
import m2.C0880v;
import n2.AbstractC0963o;

/* renamed from: z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1430v extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11830i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f11831j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f11832k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I0.z f11833l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430v(boolean z3, boolean z4, S s3, A0.k kVar, I0.z zVar) {
        super(1);
        this.f11830i = z3;
        this.f11831j = z4;
        this.f11832k = s3;
        this.f11833l = zVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0024g c0024g = (C0024g) obj;
        if (this.f11830i || !this.f11831j) {
            return Boolean.FALSE;
        }
        S s3 = this.f11832k;
        I0.F f3 = s3.f11547e;
        C1426q c1426q = s3.f11561t;
        C0880v c0880v = null;
        if (f3 != null) {
            I0.z b3 = s3.f11546d.b(AbstractC0963o.v(new I0.k(), new C0244a(c0024g, 1)));
            f3.a(null, b3);
            c1426q.l(b3);
            c0880v = C0880v.f8657a;
        }
        if (c0880v == null) {
            I0.z zVar = this.f11833l;
            String str = zVar.f3932a.f500a;
            int i2 = C0.J.f472c;
            long j3 = zVar.f3933b;
            int i3 = (int) (j3 >> 32);
            int i4 = (int) (j3 & 4294967295L);
            z2.h.f(str, "<this>");
            z2.h.f(c0024g, "replacement");
            if (i4 < i3) {
                throw new IndexOutOfBoundsException("End index (" + i4 + ") is less than start index (" + i3 + ").");
            }
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) str, 0, i3);
            sb.append((CharSequence) c0024g);
            sb.append((CharSequence) str, i4, str.length());
            String obj2 = sb.toString();
            int length = c0024g.f500a.length() + i3;
            c1426q.l(new I0.z(obj2, B1.C.j(length, length), 4));
        }
        return Boolean.TRUE;
    }
}
