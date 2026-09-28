package n1;

import a.AbstractC0423a;
import android.net.Uri;
import android.os.Bundle;
import j.C0742H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n0.C0919B;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f9086p = 0;

    /* renamed from: h, reason: collision with root package name */
    public final String f9087h;

    /* renamed from: i, reason: collision with root package name */
    public v f9088i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f9089j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9090k;

    /* renamed from: l, reason: collision with root package name */
    public final C0742H f9091l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f9092m;

    /* renamed from: n, reason: collision with root package name */
    public int f9093n;

    /* renamed from: o, reason: collision with root package name */
    public String f9094o;

    static {
        new LinkedHashMap();
    }

    public s(D d3) {
        z2.h.f(d3, "navigator");
        LinkedHashMap linkedHashMap = F.f9014b;
        this.f9087h = E.k(d3.getClass());
        this.f9090k = new ArrayList();
        this.f9091l = new C0742H();
        this.f9092m = new LinkedHashMap();
    }

    public final void a(q qVar) {
        z2.h.f(qVar, "navDeepLink");
        ArrayList S3 = AbstractC0423a.S(this.f9092m, new C0919B(1, qVar));
        if (S3.isEmpty()) {
            this.f9090k.add(qVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + qVar.f9069a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + S3).toString());
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f9092m;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            B1.t.w(entry.getValue());
            throw null;
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                B1.t.w(entry2.getValue());
                throw null;
            }
        }
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n1.r e(Q1.r r19) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.s.e(Q1.r):n1.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lb8
            boolean r2 = r9 instanceof n1.s
            if (r2 != 0) goto Ld
            goto Lb8
        Ld:
            java.util.ArrayList r2 = r8.f9090k
            n1.s r9 = (n1.s) r9
            java.util.ArrayList r3 = r9.f9090k
            boolean r2 = z2.h.a(r2, r3)
            j.H r3 = r8.f9091l
            int r4 = r3.f()
            j.H r5 = r9.f9091l
            int r6 = r5.f()
            if (r4 != r6) goto L55
            j.I r4 = new j.I
            r4.<init>(r3)
            G2.g r4 = G2.i.g0(r4)
            G2.a r4 = (G2.a) r4
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r3.c(r6)
            java.lang.Object r6 = r5.c(r6)
            boolean r6 = z2.h.a(r7, r6)
            if (r6 != 0) goto L34
            goto L55
        L53:
            r3 = r0
            goto L56
        L55:
            r3 = r1
        L56:
            java.util.LinkedHashMap r4 = r8.f9092m
            int r5 = r4.size()
            java.util.LinkedHashMap r6 = r9.f9092m
            int r7 = r6.size()
            if (r5 != r7) goto L9e
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r5 = "<this>"
            z2.h.f(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L73:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9c
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            boolean r7 = r6.containsKey(r7)
            if (r7 == 0) goto L9e
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r7 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = z2.h.a(r7, r5)
            if (r5 == 0) goto L9e
            goto L73
        L9c:
            r4 = r0
            goto L9f
        L9e:
            r4 = r1
        L9f:
            int r5 = r8.f9093n
            int r6 = r9.f9093n
            if (r5 != r6) goto Lb6
            java.lang.String r5 = r8.f9094o
            java.lang.String r9 = r9.f9094o
            boolean r9 = z2.h.a(r5, r9)
            if (r9 == 0) goto Lb6
            if (r2 == 0) goto Lb6
            if (r3 == 0) goto Lb6
            if (r4 == 0) goto Lb6
            goto Lb7
        Lb6:
            r0 = r1
        Lb7:
            return r0
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.s.equals(java.lang.Object):boolean");
    }

    public final r f(String str) {
        z2.h.f(str, "route");
        Uri parse = Uri.parse(l0.c.v(str));
        z2.h.b(parse);
        Object obj = null;
        Q1.r rVar = new Q1.r(parse, obj, obj, 7);
        return this instanceof v ? ((v) this).i(rVar, false, false, this) : e(rVar);
    }

    public int hashCode() {
        int i2 = this.f9093n * 31;
        String str = this.f9094o;
        int hashCode = i2 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f9090k.iterator();
        while (it.hasNext()) {
            int i3 = hashCode * 31;
            String str2 = ((q) it.next()).f9069a;
            hashCode = (i3 + (str2 != null ? str2.hashCode() : 0)) * 961;
        }
        C0742H c0742h = this.f9091l;
        z2.h.f(c0742h, "<this>");
        if (c0742h.f() > 0) {
            B1.t.w(c0742h.g(0));
            throw null;
        }
        LinkedHashMap linkedHashMap = this.f9092m;
        for (String str3 : linkedHashMap.keySet()) {
            int e3 = B1.t.e(hashCode * 31, 31, str3);
            Object obj = linkedHashMap.get(str3);
            hashCode = e3 + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append("0x");
        sb.append(Integer.toHexString(this.f9093n));
        sb.append(")");
        String str = this.f9094o;
        if (str != null && !H2.l.V(str)) {
            sb.append(" route=");
            sb.append(this.f9094o);
        }
        if (this.f9089j != null) {
            sb.append(" label=");
            sb.append(this.f9089j);
        }
        String sb2 = sb.toString();
        z2.h.e(sb2, "sb.toString()");
        return sb2;
    }
}
