// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Pagerduty
{
    public static class Config
    {
        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("pagerduty");

        private static readonly __Value<string?> _apiUrlOverride = new __Value<string?>(() => __config.Get("apiUrlOverride"));
        public static string? ApiUrlOverride
        {
            get => _apiUrlOverride.Get();
            set => _apiUrlOverride.Set(value);
        }

        private static readonly __Value<string?> _serviceRegion = new __Value<string?>(() => __config.Get("serviceRegion"));
        public static string? ServiceRegion
        {
            get => _serviceRegion.Get();
            set => _serviceRegion.Set(value);
        }

        private static readonly __Value<bool?> _skipCredentialsValidation = new __Value<bool?>(() => __config.GetBoolean("skipCredentialsValidation") ?? false);
        public static bool? SkipCredentialsValidation
        {
            get => _skipCredentialsValidation.Get();
            set => _skipCredentialsValidation.Set(value);
        }

        private static readonly __Value<string?> _token = new __Value<string?>(() => __config.Get("token"));
        public static string? Token
        {
            get => _token.Get();
            set => _token.Set(value);
        }

        private static readonly __Value<Pulumi.Pagerduty.Config.Types.UseAppOauthScopedToken?> _useAppOauthScopedToken = new __Value<Pulumi.Pagerduty.Config.Types.UseAppOauthScopedToken?>(() => __config.GetObject<Pulumi.Pagerduty.Config.Types.UseAppOauthScopedToken>("useAppOauthScopedToken"));
        public static Pulumi.Pagerduty.Config.Types.UseAppOauthScopedToken? UseAppOauthScopedToken
        {
            get => _useAppOauthScopedToken.Get();
            set => _useAppOauthScopedToken.Set(value);
        }

        private static readonly __Value<string?> _userToken = new __Value<string?>(() => __config.Get("userToken"));
        public static string? UserToken
        {
            get => _userToken.Get();
            set => _userToken.Set(value);
        }

        public static class Types
        {

             public class UseAppOauthScopedToken
             {
                public string PdClientId { get; set; }
                public string PdClientSecret { get; set; }
                public string PdSubdomain { get; set; }
            }
        }
    }
}
