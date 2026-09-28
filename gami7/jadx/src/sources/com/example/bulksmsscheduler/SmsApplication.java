package com.example.bulksmsscheduler;

import J2.B;
import J2.q0;
import O2.e;
import P1.o;
import Q1.p;
import U1.d;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.example.bulksmsscheduler.SmsApplication;
import com.example.bulksmsscheduler.data.AppDatabase;
import m2.C0870l;
import y2.a;

/* loaded from: classes.dex */
public final class SmsApplication extends Application {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f7377l = 0;

    /* renamed from: h, reason: collision with root package name */
    public final e f7378h = B.a(new q0(null));

    /* renamed from: i, reason: collision with root package name */
    public final C0870l f7379i;

    /* renamed from: j, reason: collision with root package name */
    public final C0870l f7380j;

    /* renamed from: k, reason: collision with root package name */
    public final C0870l f7381k;

    public SmsApplication() {
        final int i2 = 0;
        this.f7379i = new C0870l(new a(this) { // from class: P1.n

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ SmsApplication f5260i;

            {
                this.f5260i = this;
            }

            @Override // y2.a
            public final Object c() {
                SmsApplication smsApplication = this.f5260i;
                switch (i2) {
                    case 0:
                        int i3 = SmsApplication.f7377l;
                        z2.h.f(smsApplication, "this$0");
                        return AppDatabase.f7382m.i(smsApplication);
                    case 1:
                        int i4 = SmsApplication.f7377l;
                        z2.h.f(smsApplication, "this$0");
                        return new p((AppDatabase) smsApplication.f7379i.getValue());
                    default:
                        int i5 = SmsApplication.f7377l;
                        z2.h.f(smsApplication, "this$0");
                        return new U1.d(smsApplication, smsApplication.a());
                }
            }
        });
        final int i3 = 1;
        this.f7380j = new C0870l(new a(this) { // from class: P1.n

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ SmsApplication f5260i;

            {
                this.f5260i = this;
            }

            @Override // y2.a
            public final Object c() {
                SmsApplication smsApplication = this.f5260i;
                switch (i3) {
                    case 0:
                        int i32 = SmsApplication.f7377l;
                        z2.h.f(smsApplication, "this$0");
                        return AppDatabase.f7382m.i(smsApplication);
                    case 1:
                        int i4 = SmsApplication.f7377l;
                        z2.h.f(smsApplication, "this$0");
                        return new p((AppDatabase) smsApplication.f7379i.getValue());
                    default:
                        int i5 = SmsApplication.f7377l;
                        z2.h.f(smsApplication, "this$0");
                        return new U1.d(smsApplication, smsApplication.a());
                }
            }
        });
        final int i4 = 2;
        this.f7381k = new C0870l(new a(this) { // from class: P1.n

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ SmsApplication f5260i;

            {
                this.f5260i = this;
            }

            @Override // y2.a
            public final Object c() {
                SmsApplication smsApplication = this.f5260i;
                switch (i4) {
                    case 0:
                        int i32 = SmsApplication.f7377l;
                        z2.h.f(smsApplication, "this$0");
                        return AppDatabase.f7382m.i(smsApplication);
                    case 1:
                        int i42 = SmsApplication.f7377l;
                        z2.h.f(smsApplication, "this$0");
                        return new p((AppDatabase) smsApplication.f7379i.getValue());
                    default:
                        int i5 = SmsApplication.f7377l;
                        z2.h.f(smsApplication, "this$0");
                        return new U1.d(smsApplication, smsApplication.a());
                }
            }
        });
    }

    public final p a() {
        return (p) this.f7380j.getValue();
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        d dVar = (d) this.f7381k.getValue();
        dVar.getClass();
        IntentFilter intentFilter = new IntentFilter("SMS_SENT");
        int i2 = Build.VERSION.SDK_INT;
        I1.d dVar2 = dVar.f5791e;
        Context context = dVar.f5787a;
        if (i2 >= 33) {
            context.registerReceiver(dVar2, intentFilter, 4);
        } else {
            context.registerReceiver(dVar2, intentFilter);
        }
        B.r(this.f7378h, null, 0, new o(this, null), 3);
    }
}
