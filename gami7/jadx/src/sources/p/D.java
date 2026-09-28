package p;

import java.util.List;
import n0.C0930i;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9394a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        if ((!b0.c.b(n0.AbstractC0937p.h(r7, true), 0)) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0057 -> B:10:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(long r12, n0.C0918A r14, q2.InterfaceC1073d r15) {
        /*
            boolean r0 = r15 instanceof p.C1050x
            if (r0 == 0) goto L13
            r0 = r15
            p.x r0 = (p.C1050x) r0
            int r1 = r0.f9704n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9704n = r1
            goto L18
        L13:
            p.x r0 = new p.x
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f9703m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9704n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            z2.r r12 = r0.f9702l
            n0.A r13 = r0.f9701k
            C1.y.J(r15)
            r14 = r13
            goto L5a
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            C1.y.J(r15)
            n0.D r15 = r14.f8905l
            n0.i r15 = r15.f8919z
            boolean r15 = d(r15, r12)
            if (r15 == 0) goto L43
            return r4
        L43:
            z2.r r15 = new z2.r
            r15.<init>()
            r15.f11908h = r12
            r12 = r15
        L4b:
            r0.f9701k = r14
            r0.f9702l = r12
            r0.f9704n = r3
            n0.j r13 = n0.EnumC0931j.f8947i
            java.lang.Object r15 = r14.a(r13, r0)
            if (r15 != r1) goto L5a
            return r1
        L5a:
            n0.i r15 = (n0.C0930i) r15
            java.util.List r13 = r15.f8943a
            int r2 = r13.size()
            r5 = 0
            r6 = r5
        L64:
            if (r6 >= r2) goto L7b
            java.lang.Object r7 = r13.get(r6)
            r8 = r7
            n0.r r8 = (n0.r) r8
            long r8 = r8.f8957a
            long r10 = r12.f11908h
            boolean r8 = n0.q.a(r8, r10)
            if (r8 == 0) goto L78
            goto L7c
        L78:
            int r6 = r6 + 1
            goto L64
        L7b:
            r7 = r4
        L7c:
            n0.r r7 = (n0.r) r7
            if (r7 != 0) goto L82
            r7 = r4
            goto Lb7
        L82:
            boolean r13 = n0.AbstractC0937p.c(r7)
            if (r13 == 0) goto Laa
            java.util.List r13 = r15.f8943a
            int r15 = r13.size()
        L8e:
            if (r5 >= r15) goto L9f
            java.lang.Object r2 = r13.get(r5)
            r6 = r2
            n0.r r6 = (n0.r) r6
            boolean r6 = r6.f8960d
            if (r6 == 0) goto L9c
            goto La0
        L9c:
            int r5 = r5 + 1
            goto L8e
        L9f:
            r2 = r4
        La0:
            n0.r r2 = (n0.r) r2
            if (r2 != 0) goto La5
            goto Lb7
        La5:
            long r5 = r2.f8957a
            r12.f11908h = r5
            goto L4b
        Laa:
            long r5 = n0.AbstractC0937p.h(r7, r3)
            r8 = 0
            boolean r13 = b0.c.b(r5, r8)
            r13 = r13 ^ r3
            if (r13 == 0) goto L4b
        Lb7:
            if (r7 == 0) goto Lc0
            boolean r12 = r7.b()
            if (r12 != 0) goto Lc0
            r4 = r7
        Lc0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.D.a(long, n0.A, q2.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(long r9, n0.C0918A r11, q2.InterfaceC1073d r12) {
        /*
            boolean r0 = r12 instanceof p.C1052y
            if (r0 == 0) goto L13
            r0 = r12
            p.y r0 = (p.C1052y) r0
            int r1 = r0.f9710n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9710n = r1
            goto L18
        L13:
            p.y r0 = new p.y
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f9709m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9710n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            z2.s r9 = r0.f9708l
            n0.r r10 = r0.f9707k
            C1.y.J(r12)     // Catch: n0.C0932k -> L90
            goto L99
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            C1.y.J(r12)
            n0.D r12 = r11.f8905l
            n0.i r12 = r12.f8919z
            boolean r12 = d(r12, r9)
            if (r12 == 0) goto L43
            return r4
        L43:
            n0.D r12 = r11.f8905l
            n0.i r12 = r12.f8919z
            java.util.List r12 = r12.f8943a
            int r2 = r12.size()
            r5 = 0
        L4e:
            if (r5 >= r2) goto L63
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            n0.r r7 = (n0.r) r7
            long r7 = r7.f8957a
            boolean r7 = n0.q.a(r7, r9)
            if (r7 == 0) goto L60
            goto L64
        L60:
            int r5 = r5 + 1
            goto L4e
        L63:
            r6 = r4
        L64:
            r10 = r6
            n0.r r10 = (n0.r) r10
            if (r10 != 0) goto L6a
            return r4
        L6a:
            z2.s r9 = new z2.s
            r9.<init>()
            z2.s r12 = new z2.s
            r12.<init>()
            r12.f11909h = r10
            u0.V0 r2 = r11.f()
            long r5 = r2.f()
            p.z r2 = new p.z     // Catch: n0.C0932k -> L90
            r2.<init>(r12, r9, r4)     // Catch: n0.C0932k -> L90
            r0.f9707k = r10     // Catch: n0.C0932k -> L90
            r0.f9708l = r9     // Catch: n0.C0932k -> L90
            r0.f9710n = r3     // Catch: n0.C0932k -> L90
            java.lang.Object r9 = r11.g(r5, r2, r0)     // Catch: n0.C0932k -> L90
            if (r9 != r1) goto L99
            return r1
        L90:
            java.lang.Object r9 = r9.f11909h
            n0.r r9 = (n0.r) r9
            if (r9 != 0) goto L98
            r4 = r10
            goto L99
        L98:
            r4 = r9
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.D.b(long, n0.A, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(n0.C0918A r4, long r5, y2.c r7, q2.InterfaceC1073d r8) {
        /*
            boolean r0 = r8 instanceof p.C
            if (r0 == 0) goto L13
            r0 = r8
            p.C r0 = (p.C) r0
            int r1 = r0.f9383n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9383n = r1
            goto L18
        L13:
            p.C r0 = new p.C
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9382m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9383n
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            y2.c r4 = r0.f9381l
            n0.A r5 = r0.f9380k
            C1.y.J(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            C1.y.J(r8)
        L38:
            r0.f9380k = r4
            r0.f9381l = r7
            r0.f9383n = r3
            java.lang.Object r8 = a(r5, r4, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            n0.r r8 = (n0.r) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = n0.AbstractC0937p.c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.l(r8)
            long r5 = r8.f8957a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: p.D.c(n0.A, long, y2.c, q2.d):java.lang.Object");
    }

    public static final boolean d(C0930i c0930i, long j3) {
        Object obj;
        List list = c0930i.f8943a;
        int size = list.size();
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (n0.q.a(((n0.r) obj).f8957a, j3)) {
                break;
            }
            i2++;
        }
        n0.r rVar = (n0.r) obj;
        if (rVar != null && rVar.f8960d) {
            z3 = true;
        }
        return true ^ z3;
    }
}
