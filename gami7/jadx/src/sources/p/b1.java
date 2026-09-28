package p;

import H.K3;
import m2.C0880v;
import n0.C0921D;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final N f9568a = new N(3, null, 2);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(n0.C0918A r8, q2.InterfaceC1073d r9) {
        /*
            boolean r0 = r9 instanceof p.F0
            if (r0 == 0) goto L13
            r0 = r9
            p.F0 r0 = (p.F0) r0
            int r1 = r0.f9416m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9416m = r1
            goto L18
        L13:
            p.F0 r0 = new p.F0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9415l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9416m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n0.A r8 = r0.f9414k
            C1.y.J(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            C1.y.J(r9)
        L34:
            r0.f9414k = r8
            r0.f9416m = r3
            n0.j r9 = n0.EnumC0931j.f8947i
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L41
            goto L71
        L41:
            n0.i r9 = (n0.C0930i) r9
            java.util.List r2 = r9.f8943a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4b:
            if (r6 >= r4) goto L59
            java.lang.Object r7 = r2.get(r6)
            n0.r r7 = (n0.r) r7
            r7.a()
            int r6 = r6 + 1
            goto L4b
        L59:
            java.util.List r9 = r9.f8943a
            int r2 = r9.size()
        L5f:
            if (r5 >= r2) goto L6f
            java.lang.Object r4 = r9.get(r5)
            n0.r r4 = (n0.r) r4
            boolean r4 = r4.f8960d
            if (r4 == 0) goto L6c
            goto L34
        L6c:
            int r5 = r5 + 1
            goto L5f
        L6f:
            m2.v r1 = m2.C0880v.f8657a
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b1.a(n0.A, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(n0.C0918A r10, boolean r11, n0.EnumC0931j r12, q2.InterfaceC1073d r13) {
        /*
            boolean r0 = r13 instanceof p.D0
            if (r0 == 0) goto L13
            r0 = r13
            p.D0 r0 = (p.D0) r0
            int r1 = r0.f9399o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9399o = r1
            goto L18
        L13:
            p.D0 r0 = new p.D0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f9398n
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9399o
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f9397m
            n0.j r11 = r0.f9396l
            n0.A r12 = r0.f9395k
            C1.y.J(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            C1.y.J(r13)
        L3c:
            r0.f9395k = r10
            r0.f9396l = r12
            r0.f9397m = r11
            r0.f9399o = r3
            java.lang.Object r13 = r10.a(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            n0.i r13 = (n0.C0930i) r13
            java.util.List r2 = r13.f8943a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L78
            java.lang.Object r7 = r2.get(r6)
            n0.r r7 = (n0.r) r7
            if (r11 == 0) goto L6e
            boolean r8 = r7.b()
            if (r8 != 0) goto L3c
            boolean r8 = r7.f8964h
            if (r8 != 0) goto L3c
            boolean r7 = r7.f8960d
            if (r7 == 0) goto L3c
            goto L75
        L6e:
            boolean r7 = n0.AbstractC0937p.a(r7)
            if (r7 != 0) goto L75
            goto L3c
        L75:
            int r6 = r6 + 1
            goto L55
        L78:
            java.util.List r10 = r13.f8943a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b1.b(n0.A, boolean, n0.j, q2.d):java.lang.Object");
    }

    public static Object d(C0921D c0921d, K3 k3, y2.c cVar, InterfaceC1073d interfaceC1073d, int i2) {
        y2.f fVar = k3;
        if ((i2 & 4) != 0) {
            fVar = f9568a;
        }
        Object e3 = J2.B.e(new Z0(c0921d, fVar, null, null, cVar, null), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r0 = r12.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r9 >= r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r10 = (n0.r) r12.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r10.b() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (n0.AbstractC0937p.g(r10, r8.f8905l.f8913D, r8.d()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r0 = n0.EnumC0931j.f8948j;
        r1.f9558k = r8;
        r1.f9559l = r3;
        r1.f9561n = 2;
        r0 = r8.a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(n0.C0918A r17, n0.EnumC0931j r18, q2.InterfaceC1073d r19) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b1.e(n0.A, n0.j, q2.d):java.lang.Object");
    }
}
